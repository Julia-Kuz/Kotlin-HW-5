import org.junit.Assert.*
import org.junit.Test
/*
class WallTestHW5 {

    @Test
    fun add() {
        val addWall = Wall()
        val postTest1 = Post(10,11,111,1111, 11111, "1", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111)

        val result = addWall.add(postTest1)
        val expected: Boolean = result.id != 0

        return assertTrue(expected)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val updateWall = Wall()
        // заполняем несколькими постами
        updateWall.add(Post(1,11,111,1111, 11111, "1", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        updateWall.add(Post(2,11,111,1111, 11111, "2", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        updateWall.add(Post(3,11,111,1111, 11111, "3", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        // создаём информацию об обновлении
        val postForUpdate = Post(1,11,111,1111, 11111, "4", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111)

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
        updateWall.add(Post(1,11,111,1111, 11111, "1", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        updateWall.add(Post(2,11,111,1111, 11111, "2", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        updateWall.add(Post(3,11,111,1111, 11111, "3", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111))
        // создаём информацию об обновлении
        val postForUpdate = Post(5,11,111,1111, 11111, "4", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111)

        // выполняем целевое действие
        val result = updateWall.update(postForUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse (result)
    }
}

*/