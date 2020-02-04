package br.com.rac.baseclean.data.network.service

import br.com.rac.baseclean.data.model.NewsListData
import io.reactivex.Single
import retrofit2.http.GET

interface NewsService {

    @GET("mostviewed/World/1.json")
    fun getLatestNews(): Single<NewsListData>
}