package com.example.mvp.model

import com.example.mvp.view.CounterView


class Presenter {
    private val model = CounterModel()

    private lateinit var view: CounterView

     fun incrementCount(){
        model.incremet()
        view.updateCounter(model.getCount())
         view.setToast(model.getCount())
         view.setColor(model.getCount())
    }
     fun decrementCount(){

         model.decrement()
         view.updateCounter(model.getCount())
         view.setToast(model.getCount())
         view.setColor(model.getCount())
    }

    fun attachView(view: CounterView){
       this.view = view
    }
}