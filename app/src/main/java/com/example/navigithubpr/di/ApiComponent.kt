package com.example.navigithubpr.di

import com.example.navigithubpr.model.PullRequestService
import com.example.navigithubpr.viewmodel.PullRequestViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: PullRequestService)

    fun inject(viewModel: PullRequestViewModel)
}