package com.example.mvp.view


interface CounterView {
    fun updateCounter(count : Int)
    fun setToast(count:Int)
    fun setColor(count:Int)
}