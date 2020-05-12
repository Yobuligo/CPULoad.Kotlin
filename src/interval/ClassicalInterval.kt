package interval

import core.Direction
import core.IInterval
import core.IntervalSize

class ClassicalInterval : IInterval {
    private var intervalSize: IntervalSize = IntervalSize.GIGANTIC
    private var direction = Direction.DOWN
    override val waitingTime: Long = 3000
    override val size: Int
        get() = intervalSize.size

    override fun switchInterval() {
        determineCurrentMax()
    }

    private fun determineCurrentMax() {
        if (direction == Direction.DOWN) {
            determineCurrentMaxSizeDown()
        } else {
            determineCurrentMaxSizeUp()
        }
    }

    private fun determineCurrentMaxSizeDown() {
        when (intervalSize) {
            IntervalSize.GIGANTIC -> intervalSize = IntervalSize.HUGE
            IntervalSize.HUGE -> intervalSize = IntervalSize.BIG
            IntervalSize.BIG -> intervalSize = IntervalSize.SMALL
            IntervalSize.SMALL -> intervalSize = IntervalSize.TINY
            IntervalSize.TINY -> {
                switchDirection()
                determineCurrentMaxSizeUp()
            }
        }
    }

    private fun determineCurrentMaxSizeUp() {
        when (intervalSize) {
            IntervalSize.TINY -> intervalSize = IntervalSize.SMALL
            IntervalSize.SMALL -> intervalSize = IntervalSize.BIG
            IntervalSize.BIG -> intervalSize = IntervalSize.HUGE
            IntervalSize.HUGE -> intervalSize = IntervalSize.GIGANTIC
            IntervalSize.GIGANTIC -> {
                switchDirection()
                determineCurrentMaxSizeDown()
            }
        }
    }

    private fun switchDirection() {
        direction = if (direction == Direction.DOWN) {
            Direction.UP
        } else {
            Direction.DOWN
        }
    }
}