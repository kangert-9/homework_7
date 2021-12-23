package ru.geekbrains.di

import dagger.Module
import dagger.Provides
import ru.geekbrains.data.GitHubUserRepository
import ru.geekbrains.data.GitHubUserRepositoryImpl
import ru.geekbrains.data.retrofit.GitHubApi
import ru.geekbrains.data.room.DBStorage
import javax.inject.Named

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(@Named("prod") api: GitHubApi, dbStorage: DBStorage): GitHubUserRepository {
        return GitHubUserRepositoryImpl(api, dbStorage)
    }
}