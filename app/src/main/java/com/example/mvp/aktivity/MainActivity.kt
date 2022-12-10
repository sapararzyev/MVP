package com.example.mvp.aktivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.model.Presenter
import com.example.mvp.view.CounterView

class MainActivity : AppCompatActivity(),CounterView {

    private lateinit var binding:ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        presenter.attachView(this)
        setContentView(binding.root)
        fromPrecenter()
    }
    private fun fromPrecenter(){
        binding.btnincrement.setOnClickListener{
             presenter.incrementCount()
        }

        binding.btndecrement.setOnClickListener{
            presenter.decrementCount()
        }
    }

    override fun updateCounter(count: Int) {
     binding.tvCount.text = count.toString()
    }
    override fun setToast(count: Int) {
     if (count == 10){
         Toast.makeText(this,"поздравляем",Toast.LENGTH_SHORT).show()
     }
    }
    override fun setColor(count:Int) {
       if (count == 15){
           binding.tvCount.setTextColor(Color.GREEN)
         }else{
             binding.tvCount.setTextColor(Color.BLUE)
         }
       }
    }
