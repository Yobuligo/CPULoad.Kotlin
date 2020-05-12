package process

import core.*

class SingleCycle : ICycle {
    override fun process(processContext: IProcessContext) {
        val filler: IProcess = Sleeper(StopWatch(Filler()))
        filler.process(processContext)
        val cleaner: IProcess = Sleeper(StopWatch(Cleaner()))
        cleaner.process(processContext)
    }
}