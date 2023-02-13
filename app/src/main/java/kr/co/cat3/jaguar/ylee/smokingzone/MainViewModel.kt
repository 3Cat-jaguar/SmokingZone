package kr.co.cat3.jaguar.ylee.smokingzone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _list : MutableLiveData<Array<String>> = MutableLiveData()
    val list : LiveData<Array<String>> = _list

    fun getList() {
//        TODO(openAPI 에서 데이터 불러오기)
    }
}