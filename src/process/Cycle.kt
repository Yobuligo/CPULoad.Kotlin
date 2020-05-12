package process

import core.ICycle
import core.IProcessContext

class Cycle : ICycle {
    override fun process(processContext: IProcessContext) {
        while (true) {
            val singleCycle: ICycle = SingleCycle()
            singleCycle.process(processContext)
            processContext.interval.switchInterval()
        }
    }
}