package kr.co.cat3.jaguar.ylee.smokingzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.cat3.jaguar.ylee.smokingzone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
    }
}