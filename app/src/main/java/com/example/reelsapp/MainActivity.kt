package com.example.reelsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.reelsapp.adapters.VideoAdapter
import com.example.reelsapp.models.VideoItem
import java.util.UUID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val videoViewPager2 = findViewById<ViewPager2>(R.id.videoViewPager2)

        val videoList = listOf(
            VideoItem(
                UUID.randomUUID().toString(),
                "android.resource://" +packageName+"/"+R.raw.video1
            ),
            VideoItem(
                UUID.randomUUID().toString(),
                "android.resource://" +packageName+"/"+R.raw.video4
            ),
            VideoItem(
                UUID.randomUUID().toString(),
                "android.resource://" +packageName+"/"+R.raw.video5
            ),
        )

        val videoAdapter = VideoAdapter()
        videoAdapter.submitList(videoList)
        videoViewPager2.adapter = videoAdapter


    }
}