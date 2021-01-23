package LSP.poststype

import LSP.Post

class FreejnaPost : Post() {

    override fun createPost(post: String): String {
        return getDatabase().createFreejnaPost(post)
    }
}