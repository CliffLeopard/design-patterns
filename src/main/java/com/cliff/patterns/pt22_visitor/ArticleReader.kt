package com.cliff.patterns.pt22_visitor

class ArticleReader(private val article: Article) {
    private var sum: Int = 0

    fun accept(visitor: Visitor2) {
        visitor.visitStart()
        visitor.visitTitle(article.getTitle())
        article.getContent().forEach {
            visitor.visitContent(it)
        }
        visitor.visitLast(article.getLast())
        visitor.visitEnd()
        sum = visitor.getSum()
    }

    fun getSum(): Int {
        return sum
    }
}