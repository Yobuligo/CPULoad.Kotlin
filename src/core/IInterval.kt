package core

interface IInterval {
    val size: Int
    val waitingTime: Long
    fun switchInterval()
}