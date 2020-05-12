package process

import core.Direction
import core.IProcess
import core.IProcessContext
import java.time.Instant

class StopWatch(val process: IProcess) : IProcess {
    override val direction: Direction = process.direction

    override fun process(processContext: IProcessContext) {
        val startTime = Instant.now()
        process.process(processContext)
        val endTime = Instant.now()
        printResult(processContext, startTime, endTime)
    }

    private fun printResult(processContext: IProcessContext, startime: Instant, endtime: Instant) {
        val difference = endtime.toEpochMilli() - startime.toEpochMilli()
        println("Count ${direction} needs ${difference.toString()} for interval size of ${processContext.interval.size}.")
    }
}