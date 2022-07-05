package com.example.zosequick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zosequick.databinding.ActivityTeasingOneBinding

class TeasingOneActivity : AppCompatActivity() {
    lateinit var binding:ActivityTeasingOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTeasingOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSkip.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
//        binding.btnNext.setOnClickListener {
//
//        }
    }
}