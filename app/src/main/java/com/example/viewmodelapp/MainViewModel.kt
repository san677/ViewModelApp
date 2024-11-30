package com.example.viewmodelapp

 import androidx.lifecycle.ViewModel

class MainViewModel( val intialValue: Int): ViewModel() {
    var count:Int=intialValue


    fun increment( ){
        count++

    }
}