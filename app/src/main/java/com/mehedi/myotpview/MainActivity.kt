package com.mehedi.myotpview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.mehedi.myotpview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.firstPinView.addTextChangedListener {

    Toast.makeText(this@MainActivity,"${binding.firstPinView.text.toString()}",Toast.LENGTH_LONG).show()
}

//        binding.firstPinView.addTextChangedListener {
//            object : TextWatcher {
//                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                    TODO("Not yet implemented")
//                }
//
//                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//                    Toast.makeText(this@MainActivity,"clicked",Toast.LENGTH_LONG).show()
//                    Log.d(
//                        "TAG",
//                        "onTextChanged() called with: s = [$s], start = [$start], before = [$before], count = [$count]"
//                    )
//                }
//
//                override fun afterTextChanged(p0: Editable?) {
//                    TODO("Not yet implemented")
//                }
//            }
//        }


    }
}