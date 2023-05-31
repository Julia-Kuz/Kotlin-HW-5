fun main() {

    // Задание 1

    val post1 = Post(
        8, 22, 10, "message1", "reply",
        friendsOnly = false,
        canEdit = true,
        isFavourite = true,
    )

    val post2 = Post(
        100, 50, 22, "message2", "copy",
        friendsOnly = true,
        canEdit = true,
        isFavourite = true,
        comment = Comments(120),
        like = Likes(500)
    )

    println(post1)
    println(post2)
    println()

    // Задание 2

    val postWithUniqueId = Wall()
    postWithUniqueId.add(post1)
    postWithUniqueId.add(post2)
    println(post1)
    println(postWithUniqueId.getAllPosts())


    val post3 = Post(
        1, 500, 400, "message3", "suggest",
        friendsOnly = true,
        canEdit = true,
        isFavourite = true,
        comment = Comments(0),
        like = Likes(0)
    )
    println(postWithUniqueId.update(post3))
    println(postWithUniqueId.getAllPosts())


}

data class Post(
    var id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val text: String,
    val postType: String,
    val friendsOnly: Boolean,
    val canEdit: Boolean,
    val isFavourite: Boolean,
    val comment: Comments = Comments(),
    val like: Likes = Likes()
)


data class Comments(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = true,
    val canClose: Boolean = true,
    val cavOpen: Boolean = true
)

data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true
)

class Wall {

    private var posts = emptyArray<Post>()
    private var idUnique = 1

    fun add(post: Post): Post {
        post.id = idUnique
        idUnique += 1
        posts += post
        //println(posts.contentToString())
        return post
    }


    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }

    // для себя
    fun getAllPosts(): String {
        return posts.joinToString("\n")
    }
}
