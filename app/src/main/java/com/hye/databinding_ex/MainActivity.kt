package com.hye.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.hye.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //데이터 바인딩
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //데이터 바인딩
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //1번 방식. findViewById
//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener {
//            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
//        }

        //2번 방식. databinding
        //바인딩에서 testBtnId를 바로 갖고 옴
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }



    }
}