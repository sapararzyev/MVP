package com.example.mvp.model


class CounterModel {

    private var conunt = 0

    fun incremet(){
        conunt ++
    }

    fun decrement(){
        conunt --
    }

    fun getCount(): Int{
        return conunt
    }
}