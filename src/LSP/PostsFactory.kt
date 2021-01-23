package LSP

import LSP.poststype.FreejnaPost
import LSP.poststype.MentionPost
import LSP.poststype.TagPost

class PostsFactory {

    fun createPost(sign: String): Post {

        return when {
            sign.startsWith("@") -> TagPost()
            sign.startsWith("#") -> MentionPost()
            sign.startsWith("F") -> FreejnaPost()
            else -> Post()
        }
    }
}