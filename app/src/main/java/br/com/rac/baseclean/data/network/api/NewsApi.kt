package br.com.rac.baseclean.data.network.api

import br.com.rac.baseclean.data.model.NewsListData
import br.com.rac.baseclean.data.network.service.NewsService
import io.reactivex.Single
import javax.inject.Inject

class NewsApi @Inject constructor() : BaseApi() {

    private var newsService: NewsService

    init {
        val retrofit = build()
        newsService = retrofit.create(NewsService::class.java)
    }

    fun getLatestNews(): Single<NewsListData> = newsService.getLatestNews()
}