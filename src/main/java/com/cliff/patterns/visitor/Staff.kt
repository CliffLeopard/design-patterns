package com.cliff.patterns.visitor

import kotlin.random.Random

abstract class Staff(val name: String, var kpi: Int) {
    abstract fun accept(visitor: Visitor)
}

class Engineer(name: String, kpi: Int) : Staff(name, kpi) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun getCodeLines(): Int = Random.nextInt(1000)
}

class Manager(name: String, kpi: Int) : Staff(name, kpi) {
    override fun accept(visitor: Visitor) = visitor.visit(this)

    fun getProductNumber(): Int = Random.nextInt(50)
}