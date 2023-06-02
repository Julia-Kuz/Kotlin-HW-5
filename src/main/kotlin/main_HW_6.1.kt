
data class Post(
    var id: Int?,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavourite: Boolean,
    val postponedId: Int,
    val comment: Comments? = Comments(),
    val copyright: Copyright = Copyright(),
    val like: Likes? = Likes(),
    val reposts: Reposts? = Reposts(),
    val views: Views? = Views(),
    val geo: Geo = Geo(),
    val donut: Donut = Donut(),
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

data class Copyright(
    val id: Int = 1,
    val link: String = "netology.ru",
    val name: String = "Netology",
    val type: String = "reference"
)

data class Reposts(
    val counter: Int = 0,
    val userReposted: Int = 0
)

data class Views(
    val count: Int = 0
)

data class Geo(
    val type: String = "Moscow",
    val coordinates: String = " 55.7522, 37.6156",

    )

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val canPublishFreeCopy: Boolean = false,
    val editMode: String = "all"
)

//***************************************************************************************************

class Wall {

    private var posts = emptyArray<Post>()
    private var idUnique = 1

    fun add(post: Post): Post {
        //posts += post.copy(id = idUnique++)   ПОЧЕМУ НЕЛЬЗЯ ПРОСТО id УКАЗАТЬ ????
        posts += post.copy(id = idUnique++, comment = post.comment?.copy(), like = post.like?.copy())
        return posts.last() //return posts.last().copy()

    }


    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == post.id) {
                posts[index] = post.copy()
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

//**********************************************************************************
fun main() {

    val post1 = Post(
        101, 11, 111, 1111, 11111, "1", 111111, 1111111, false, "reply", 11111111,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavourite = false,
        postponedId = 111111111,
    )

    val post2 = Post(
        202, 22, 222, 2222, 22222, "1", 222222, 2222222, false, "reply", 22222222,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavourite = false,
        postponedId = 222222222,
        comment = Comments(30),
        like = Likes(500),

        )

    println(post1)
    println(post2)
    println()

    //

    val postWithUniqueId = Wall()
    postWithUniqueId.add(post1)
    postWithUniqueId.add(post2)

    println(postWithUniqueId.getAllPosts())


    val post3 = Post(
        1, 33, 333, 3333, 11111, "1", 111111, 1111111, false, "reply", 11111111,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavourite = false,
        postponedId = 111111111,

        )
    println(postWithUniqueId.update(post3))
    println(postWithUniqueId.getAllPosts())


}

