package com.sibela.motionlayoutalarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibela.motionlayoutalarm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alarmRecycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AlarmAdapter()
        }
    }
}