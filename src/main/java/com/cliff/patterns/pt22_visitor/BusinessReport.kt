package com.cliff.patterns.pt22_visitor

import kotlin.random.Random

object BusinessReport {

    private var mStaffs = mutableListOf<Staff>()

    init {
        mStaffs.add(Manager("经理-A", Random.nextInt(10)))
        mStaffs.add(Manager("经理-B", Random.nextInt(10)))
        mStaffs.add(Engineer("工程师-A", Random.nextInt(10)))
        mStaffs.add(Engineer("工程师-B", Random.nextInt(10)))
        mStaffs.add(Engineer("工程师-C", Random.nextInt(10)))
        mStaffs.add(Engineer("工程师-D", Random.nextInt(10)))
    }

    private fun showReport(visitor: Visitor) {
        mStaffs.forEach {
            it.accept(visitor)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        showReport(CEOVisitor())
        showReport(CTOVisitor())
    }
}