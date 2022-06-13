package com.example.animationhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.animationhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var animation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnComb.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.combination)
            binding.image.startAnimation(animation)
        }

        binding.btnAlpha.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
            binding.image.startAnimation(animation)
        }

        binding.btnRotate.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            binding.image.startAnimation(animation)
        }

        binding.btnScale.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            binding.image.startAnimation(animation)
        }

        binding.btnTrans.setOnClickListener {
            animation = AnimationUtils.loadAnimation(this, R.anim.translate)
            binding.image.startAnimation(animation)
        }
    }
}