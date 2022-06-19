package com.ishwar.lifecycleobserver

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
//    Mutable Live Data
    var _text=MutableLiveData<String>()
    var _btnText=MutableLiveData<String>()

    //Live Data
    val text:LiveData<String> get() =_text
    val btnText:LiveData<String> get() =_btnText

    init {
        _text.value="Hey !  Subscribe our channel Ishwar Parihar"
        _btnText.value="Subscribe"
    }
    fun updateText(){
        _text.value=" Congratulation Subscribe our channel Ishwar Parihar"
        _btnText.value="Already Subscribe"
    }
}