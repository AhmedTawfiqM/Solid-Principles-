package LSP.poststype

import LSP.Post

class TagPost : Post() {

    override fun createPost(post: String): String {
        return getDatabase().createTagPost(post)
    }
}