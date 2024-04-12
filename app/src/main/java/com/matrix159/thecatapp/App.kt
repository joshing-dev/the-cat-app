package com.matrix159.thecatapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber.*
import timber.log.Timber


@HiltAndroidApp
class App: Application() {
  override fun onCreate() {
    super.onCreate()

    if (BuildConfig.DEBUG) {
      Timber.plant(DebugTree())
    } else {
      // TODO: Plant a crash reporting tree for production
    }
  }
}