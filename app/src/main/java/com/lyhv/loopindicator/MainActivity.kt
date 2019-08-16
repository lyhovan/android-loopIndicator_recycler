package com.lyhv.loopindicator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lyhv.library.IndicatorConfig
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mMyPagerAdapter: MyPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onInit()
    }

    private fun onInit() {
        mMyPagerAdapter = MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = mMyPagerAdapter
        // recyclerTabLayout.setUpWithViewPager(viewPager)
        val titleItems: ArrayList<String> = ArrayList()
        for (index in 0 until mMyPagerAdapter.getRealItemSize()) {
            titleItems.add("Index $index")
        }
        viewPager.currentItem = IndicatorConfig.LOOP_COUNT / 2
        myRecyclerTabLayout.setUpWithViewPager(this, titleItems, viewPager)
    }
}
