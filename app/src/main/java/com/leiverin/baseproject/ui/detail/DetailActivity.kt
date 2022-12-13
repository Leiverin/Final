package com.leiverin.baseproject.ui.detail

import com.leiverin.baseproject.R
import com.leiverin.baseproject.databinding.ActivityDetailBinding
import com.leiverin.baseproject.ui.base.BaseActivity

class DetailActivity : BaseActivity<ActivityDetailBinding, DetailViewModel>() {

    override fun layoutRes(): Int = R.layout.activity_detail

    override fun viewModelClass(): Class<DetailViewModel> = DetailViewModel::class.java

    override fun initView() {

    }
}