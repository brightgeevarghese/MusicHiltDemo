package edu.miu.musichiltdemo.data

interface MusicRepository {
    fun getMusicList(): List<String>
}