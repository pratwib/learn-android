package com.pratwib.myviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.pratwib.myviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
//    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btnCalculate.setOnClickListener {
            val width = binding.edtWidth.text.toString()
            val length = binding.edtLength.text.toString()
            val height = binding.edtHeight.text.toString()
            when {
                width.isEmpty() -> {
                    binding.edtWidth.error = "Masih Kosong"
                }
                length.isEmpty() -> {
                    binding.edtLength.error = "Masih Kosong"
                }
                height.isEmpty() -> {
                    binding.edtHeight.error = "Masih Kosong"
                }
                else -> {
                    viewModel.calculate(width, length, height)
                }
            }
        }
        displayResult()
    }

    private fun displayResult() {
        binding.tvResult.text = viewModel.result.toString()
    }
}