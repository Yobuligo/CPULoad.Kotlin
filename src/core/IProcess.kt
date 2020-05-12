package core

interface IProcess {
    val direction: Direction
    fun process(processContext: IProcessContext)
}