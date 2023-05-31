import org.junit.Assert.*
import org.junit.Test

class WallTestHW5 {

    @Test
    fun add() {
        val addWall = Wall()
        val postTest1 = Post(
            12, 26, 27, "test1", "reply",
            friendsOnly = false,
            canEdit = true,
            isFavourite = true,
        )

        val result = addWall.add(postTest1)
        val expected: Boolean = result.id > 0

        return assertTrue(expected)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val updateWall = Wall()
        // заполняем несколькими постами
        updateWall.add(Post(1, 2, 3, "update1", "reply", false, true, true))
        updateWall.add(Post(4, 5, 6, "update1", "reply", false, true, true))
        updateWall.add(Post(7, 8, 9, "update1", "reply", false, true, true))
        // создаём информацию об обновлении
        val postForUpdate = Post(1, 11, 12, "update1", "reply", false, true, true)

        // выполняем целевое действие
        val result = updateWall.update(postForUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue (result)
    }

    @Test
    fun updateNonExisting() {
        // создаём целевой сервис
        val updateWall = Wall()
        // заполняем несколькими постами
        updateWall.add(Post(1, 2, 3, "update1", "reply", false, true, true))
        updateWall.add(Post(4, 5, 6, "update1", "reply", false, true, true))
        updateWall.add(Post(7, 8, 9, "update1", "reply", false, true, true))
        // создаём информацию об обновлении
        val postForUpdate = Post(10, 11, 12, "update1", "reply", false, true, true)

        // выполняем целевое действие
        val result = updateWall.update(postForUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse (result)
    }
}