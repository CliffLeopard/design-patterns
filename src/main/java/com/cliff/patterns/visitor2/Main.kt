package com.cliff.patterns.visitor2

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val paper: Article = Paper(
            "标题",
            mutableListOf("第一段", "第二段"),
            "版权归我吗？"
        )

        val articleReader = ArticleReader(paper)
        // 这样看起来最内存确实需要Writer来实现。 向外包裹的各个层级都是为了在最终写入之前，进行各种过滤和修饰。
        // 最好还要有穿插始终的Context,来保存整体的状态。
        val articleWriter = ArticleWriter()
        val cliffVisitor = CliffVisitor(articleWriter)
        articleReader.accept(cliffVisitor)
        println("文章: $articleWriter")
        println("文章字数: ${articleWriter.getSum()}")
    }
}