package core

import model.Person

interface IProcessContext {
    val personList: MutableMap<Int, Person>
    val interval: IInterval
}