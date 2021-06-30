package com.cliff.patterns.visitor

interface Visitor {
    fun visit(engineer: Engineer)
    fun visit(manager: Manager)
}

class CEOVisitor : Visitor {
    override fun visit(engineer: Engineer) {
        println("engineer:${engineer.name}  kpi:${engineer.kpi}")
    }

    override fun visit(manager: Manager) {
        println("manager:${manager.name}  kpi:${manager.kpi} products:${manager.getProductNumber()}")
    }
}

class CTOVisitor : Visitor {
    override fun visit(engineer: Engineer) {
        println("engineer:${engineer.name}  codeLine:${engineer.getCodeLines()}")
    }

    override fun visit(manager: Manager) {
        println("manager:${manager.name}  products:${manager.getProductNumber()}")
    }
}