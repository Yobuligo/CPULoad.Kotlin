package process

import core.IInterval
import core.IProcessContext
import interval.ClassicalInterval
import model.Person

class ProcessContext : IProcessContext {
    override val personList = mutableMapOf<Int, Person>()
    override var interval: IInterval = ClassicalInterval()
}