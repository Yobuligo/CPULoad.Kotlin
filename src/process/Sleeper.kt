package process

import core.Direction
import core.IProcess
import core.IProcessContext

class Sleeper(val process: IProcess) : IProcess {
    override val direction: Direction = process.direction
    override fun process(processContext: IProcessContext) {
        process.process(processContext)
        sleep(processContext)
    }

    private fun sleep(processContext: IProcessContext) {
        println("Peter said I have to wait now for ${processContext.interval.waitingTime}")
        Thread.sleep(processContext.interval.waitingTime)
    }
}