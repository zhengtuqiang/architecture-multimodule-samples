package com.google.samples.modularization.feature.list.ui

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

open class Ztq {
    @Inject
    constructor(){
        Log.d("ztqmy", "Ztq: 构造函数")
    }

    fun ztq() {
        Log.d("ztqmy", "ztq: 成员函数")
    }
}

class ZtqImpl @Inject constructor() : Ztq() {

}
//
//@Module
//@InstallIn(ViewModelComponent::class)
//object ZtqProvider {
//
//    @Provides
//    fun provideZtq(): Ztq {
//        Log.d("ztqmy", "provideZtq: ")
//        return Ztq()
//    }
//}
//
//@Module
//@InstallIn(ViewModelComponent::class)
//abstract class ZtqProvider2 {
//    @Binds
//    abstract fun provideZtq(impl: ZtqImpl): Ztq
//}