import org.junit.Assert.*
import org.junit.Test
/*
class WallTestHW5 {

    @Test
    fun add() {
        val audio = AudioAttachment()
        val photo = PhotoAttachment()
        val document = DocumentAttachment()
        val note = NoteAttachment()
        val video = VideoAttachment()

        val attachments = arrayOf(audio, photo, document, note, video)

        val addWall = Wall()
        val postTest1 = Post(10,11,111,1111, 11111, "1", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        )

        val result = addWall.add(postTest1)
        val expected: Boolean = result.id != 0

        return assertTrue(expected)
    }

    @Test
    fun updateExisting() {
        val audio = AudioAttachment()
        val photo = PhotoAttachment()
        val document = DocumentAttachment()
        val note = NoteAttachment()
        val video = VideoAttachment()

        val attachments = arrayOf(audio, photo, document, note, video)
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
            postponedId = 111111111,
            attachments = attachments
        ))
        updateWall.add(Post(2,11,111,1111, 11111, "2", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        ))
        updateWall.add(Post(3,11,111,1111, 11111, "3", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        ))
        // создаём информацию об обновлении
        val postForUpdate = Post(1,11,111,1111, 11111, "4", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        )

        // выполняем целевое действие
        val result = updateWall.update(postForUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue (result)
    }

    @Test
    fun updateNonExisting() {
        val audio = AudioAttachment()
        val photo = PhotoAttachment()
        val document = DocumentAttachment()
        val note = NoteAttachment()
        val video = VideoAttachment()

        val attachments = arrayOf(audio, photo, document, note, video)
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
            postponedId = 111111111,
            attachments = attachments
        ))
        updateWall.add(Post(2,11,111,1111, 11111, "2", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        ))
        updateWall.add(Post(3,11,111,1111, 11111, "3", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        ))
        // создаём информацию об обновлении
        val postForUpdate = Post(5,11,111,1111, 11111, "4", 111111, 1111111, false, "reply", 11111111,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavourite = false,
            postponedId = 111111111,
            attachments = attachments
        )

        // выполняем целевое действие
        val result = updateWall.update(postForUpdate)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse (result)
    }
}

*/