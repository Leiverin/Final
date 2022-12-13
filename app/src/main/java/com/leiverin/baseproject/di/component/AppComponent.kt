package com.leiverin.baseproject.di.component

import android.app.Application
import com.leiverin.baseproject.AppApplication
import com.leiverin.baseproject.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBindingModule::class, DialogModule::class, FragmentModule::class, NetworkModule::class, ViewModelModule::class])
interface AppComponent: AndroidInjector<AppApplication> {

    override fun inject(instance: AppApplication?)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}