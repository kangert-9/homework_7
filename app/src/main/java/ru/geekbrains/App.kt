package ru.geekbrains

import android.app.Application
import ru.geekbrains.di.ApplicationComponent
import ru.geekbrains.di.DaggerApplicationComponent

class App: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        component = DaggerApplicationComponent.builder()
            .setContext(this)
            .build()

    }

    companion object{
        lateinit var instance: App
    }

}