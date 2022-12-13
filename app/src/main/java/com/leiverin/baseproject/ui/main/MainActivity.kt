package com.leiverin.baseproject.ui.main

import com.leiverin.baseproject.R
import com.leiverin.baseproject.databinding.ActivityMainBinding
import com.leiverin.baseproject.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun layoutRes(): Int = R.layout.activity_main

    override fun viewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun initView() {

    }
}