package com.example.navigithubpr.model

import io.reactivex.Single
import javax.inject.Inject

//Service used for api call
class PullRequestService {

    lateinit var api:PullRequestApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getPullRequest(): Single<List<PullRequest>> {
        return api.getPullRequest()
    }
}