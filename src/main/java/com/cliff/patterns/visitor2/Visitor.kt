package com.cliff.patterns.visitor2

interface Visitor {
    fun visitStart()
    fun visitTitle(title: String)
    fun visitContent(content: String)
    fun visitLast(last: String)
    fun visitEnd()
    fun getSum(): Int
}

class ArticleWriter : Visitor {

    private var builder: StringBuilder = StringBuilder()
    private var article: String = ""
    override fun visitStart() {
        article = ""
        builder.clear()
    }

    override fun visitTitle(title: String) {
        builder.append(title).append("\n\n")
    }

    override fun visitContent(content: String) {
        builder.append(content).append("\n")
    }

    override fun visitLast(last: String) {
        builder.append(last)
    }

    override fun visitEnd() {
        article = builder.toString()
    }

    override fun getSum(): Int {
        return article.filterNot(Char::isWhitespace).length
    }

    override fun toString(): String {
        return article
    }

}

class CliffVisitor(private var visitor: Visitor) : Visitor {

    override fun visitStart() {
        visitor.visitStart()
    }

    override fun visitTitle(title: String) {
        visitor.visitTitle(title)
    }

    override fun visitContent(content: String) {
        visitor.visitContent(content)
    }

    override fun visitLast(last: String) {
        visitor.visitLast(last + "是的，版权归我")
    }

    override fun visitEnd() {
        visitor.visitEnd()
    }

    override fun getSum(): Int {
        return visitor.getSum()
    }
}