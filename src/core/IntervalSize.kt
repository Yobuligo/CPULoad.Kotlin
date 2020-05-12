package core

enum class IntervalSize(val size: Int) {
    TINY(100000),
    SMALL(1000000),
    BIG(5000000),
    HUGE(10000000),
    GIGANTIC(15000000)
}