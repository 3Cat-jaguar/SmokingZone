package kr.co.cat3.jaguar.ylee.smokingzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kr.co.cat3.jaguar.ylee.smokingzone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.getListBtn.setOnClickListener {
            viewModel.getList()
        }
        viewModel.list.observe(this) {
//            TODO(리스트 어댑터 이용하여 띄우기)
        }
        setContentView(binding.root)
    }
}