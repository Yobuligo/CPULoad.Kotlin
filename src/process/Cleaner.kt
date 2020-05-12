package process

import core.Direction
import core.ICleaner
import core.IProcessContext

class Cleaner : ICleaner {
    override val direction: Direction = Direction.DOWN
    override fun process(processContext: IProcessContext) {
        for (i in processContext.personList.size downTo 1) {
            processContext.personList.remove(i)
        }
    }
}