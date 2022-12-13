package com.leiverin.baseproject

import androidx.multidex.MultiDex
import com.leiverin.baseproject.di.component.AppComponent
import com.leiverin.baseproject.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AppApplication: DaggerApplication(), HasAndroidInjector {
    lateinit var instance: AppApplication

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        instance = this
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component: AppComponent = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
        return component
    }

    override fun androidInjector(): AndroidInjector<Any> = activityInjector
}