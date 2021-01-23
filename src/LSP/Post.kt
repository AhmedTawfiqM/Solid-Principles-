package LSP

open class Post {

    private val databasePost = PostDatabase()
    fun getDatabase() = databasePost

    open fun createPost(post: String) = "Original Post : ${databasePost.createFreejnaPost(post)}"

}