package LSP.poststype

import LSP.Post

class MentionPost : Post() {

    override fun createPost(post: String): String {
        return getDatabase().createMentionPost(post)
    }
}