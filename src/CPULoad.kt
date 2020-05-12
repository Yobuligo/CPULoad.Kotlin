import core.*
import process.Cycle
import process.SingleCycle
import process.ProcessContext

fun main(args: Array<String>) {
    val cycle: ICycle = Cycle()
    cycle.process(ProcessContext())
}