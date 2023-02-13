package kr.co.cat3.jaguar.ylee.smokingzone

import android.app.Application
import android.content.Context
import timber.log.Timber

class SmokingZone : Application() {
    init {
        instance = this
    }
    companion object {
        lateinit var instance : SmokingZone
        fun getApplicationContext() : Context = instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}