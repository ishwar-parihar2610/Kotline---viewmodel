package com.ishwar.lifecycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.ishwar.lifecycleobserver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //  var count = 0
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel=mainViewModel
        binding.lifecycleOwner=this
//        setText()

//        mainViewModel.text.observe(this,{
//            binding.textView.text=it.toString()
//        })
//
//        mainViewModel.btnText.observe(this,{
//            binding.button.text=it.toString()
//        })
//        binding.button.setOnClickListener {
//            mainViewModel.updateText()
////            setText()
//        }
    }


//    fun setText() {
//        binding.textView.text = mainViewModel.text
//        binding.button.text = mainViewModel.btnText
//    }


}