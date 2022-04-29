package com.example.dzviewelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.dzviewelements.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Статус
        val statusOnline = getString(R.string.status_online)
        val statusOffline = getString(R.string.status_offline)
        binding.btStatus.setOnClickListener {
            if (binding.btStatus.text == statusOnline){
                binding.btStatus.text = statusOffline
                binding.btStatus.setBackgroundResource(R.color.status_offline_color)
            }
            else {
                binding.btStatus.text = statusOnline
                binding.btStatus.setBackgroundResource(R.color.status_online_color)
            }
        }

        //Звонок
        binding.btCall.setOnClickListener {
            Toast.makeText(this, "Звонок", Toast.LENGTH_SHORT).show()
        }
        //Сообщение
        binding.btMessage.setOnClickListener {
            Toast.makeText(this, "Сообщение", Toast.LENGTH_SHORT).show()
        }

    }
}