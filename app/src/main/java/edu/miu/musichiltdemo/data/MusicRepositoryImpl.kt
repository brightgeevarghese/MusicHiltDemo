package edu.miu.musichiltdemo.data

class MusicRepositoryImpl : MusicRepository {
    override fun getMusicList(): List<String> {
        return listOf("Song 1", "Song 2", "Song 3")
    }
}