package com.google.samples.modularization.feature.details.impl

import android.util.Log
import com.google.samples.modularization.core.obstract.MyInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Inject

class MyInterfaceImpl : MyInterface {
    @Inject constructor(){
        Log.d("ztqmy", "MyInterfaceImpl: 构造函数")
    }

    override fun myMethod() : String{
        Log.d("ztqmy", "myMethod: ")
        return "myMethod"
    }
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class MyInterfaceProvider{
    @Binds
    abstract fun provideMyInterface(impl: MyInterfaceImpl): MyInterface
}