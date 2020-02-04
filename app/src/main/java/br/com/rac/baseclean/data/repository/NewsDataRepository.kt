package br.com.rac.baseclean.data.repository

import br.com.rac.baseclean.data.mapper.NewsMapper
import br.com.rac.baseclean.data.network.api.NewsApi
import br.com.rac.baseclean.domain.model.News
import br.com.rac.baseclean.domain.repository.NewsRepository
import io.reactivex.Single
import javax.inject.Inject

class NewsDataRepository @Inject constructor(private val newsApi: NewsApi,
                                             private val newsMapper: NewsMapper) : NewsRepository {

    override fun fetchLatestNews(): Single<List<News>> =
            newsApi.getLatestNews().map { it.results?.map { newsMapper.map(it) } }
}