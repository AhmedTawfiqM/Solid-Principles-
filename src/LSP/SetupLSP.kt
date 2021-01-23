package LSP


class SetupLSP {

    private val posts = listOf("@Ali Sayed", "#Ahmed Mention", "Freejna Now")
    private val postsFactory = PostsFactory()
    private lateinit var post: Post

    fun insertPosts() {

        posts.forEach {
            post = postsFactory.createPost(it) //IOC Container "Factory Pattern"

            val result = post.createPost(it)
            println(result)
        }
    }
}