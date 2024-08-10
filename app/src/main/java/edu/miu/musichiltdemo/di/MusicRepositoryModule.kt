package edu.miu.musichiltdemo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.miu.musichiltdemo.data.MusicRepository
import edu.miu.musichiltdemo.data.MusicRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object MusicRepositoryModule {
    @Provides
    fun provideMusicRepository(): MusicRepository = MusicRepositoryImpl()
}