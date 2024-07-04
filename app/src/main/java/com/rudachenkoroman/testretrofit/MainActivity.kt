package com.rudachenkoroman.testretrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rudachenkoroman.testretrofit.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            getButton.setOnClickListener {
                CoroutineScope(Dispatchers.IO).launch {
                    val product = RetrofitInstance.productApi.getProductById(1)
                    runOnUiThread {
                        tv.text = product.title
                    }
                }
            }
        }
    }
}

