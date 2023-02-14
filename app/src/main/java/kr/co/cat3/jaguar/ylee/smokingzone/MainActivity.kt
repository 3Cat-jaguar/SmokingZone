package kr.co.cat3.jaguar.ylee.smokingzone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kr.co.cat3.jaguar.ylee.smokingzone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }
    private val zoneListAdapter by lazy { ZoneListAddapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.getListBtn.setOnClickListener {
            viewModel.getList()
        }
        viewModel.list.observe(this) {
            zoneListAdapter.submitList(it)
            binding.zoneList.adapter = zoneListAdapter
            binding.zoneList.invalidate()
        }
        setContentView(binding.root)
    }
}