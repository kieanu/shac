package com.funch.shac.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {
//
//    @Provides
//    @Singleton
//    fun provideRoomDatabase(@ApplicationContext context: Context): CharactersDatabase {
//        return CharactersDatabase.getInstance(context)
//    }
//
//    @Provides
//    @Singleton
//    fun provideCharacterDao(charactersDatabase: CharactersDatabase): CharacterDao {
//        return charactersDatabase.cachedCharacterDao()
//    }
//
//    @Provides
//    @Singleton
//    fun provideCharacterCache(characterCache: CharacterCacheImp): CharacterCache {
//        return characterCache
//    }
//
//    @Provides
//    @Singleton
//    fun providePreferenceHelper(@ApplicationContext context: Context): CachePreferencesHelper {
//        return CachePreferencesHelper(context)
//    }
}
