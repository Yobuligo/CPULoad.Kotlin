package process

import core.Direction
import core.IFiller
import core.IProcessContext
import model.Person

class Filler : IFiller {
    override val direction: Direction = Direction.UP
    override fun process(processContext: IProcessContext) {
        for (i in 1..processContext.interval.size) {
            processContext.personList.put(i, Person("CPU Load"))
        }
    }
}