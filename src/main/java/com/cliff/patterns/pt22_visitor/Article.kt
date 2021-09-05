package com.cliff.patterns.pt22_visitor

interface Article {
    fun getTitle(): String
    fun getContent(): List<String>
    fun getLast(): String
}

class Paper(private val title: String, private val content: List<String>, private val last: String) : Article {
    override fun getTitle(): String {
        return title
    }

    override fun getContent(): List<String> {
        return content
    }

    override fun getLast(): String {
        return last
    }

}