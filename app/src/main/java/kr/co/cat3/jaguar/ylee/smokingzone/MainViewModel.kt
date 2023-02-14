package kr.co.cat3.jaguar.ylee.smokingzone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _list : MutableLiveData<ArrayList<String>> = MutableLiveData()
    val list : LiveData<ArrayList<String>> = _list

    fun getList() {
//        TODO(openAPI 에서 데이터 불러오기)
        val arrayList : ArrayList<String> = arrayListOf<String>()
        for (i in 1..9) {
            val randomNum : Int = (0 until 9).random()
            arrayList.add("$randomNum 번째 제목,$randomNum 번째 내용")
        }
        _list.value = arrayList
    }
}