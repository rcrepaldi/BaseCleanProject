package br.com.rac.baseclean.domain.repository

import br.com.rac.baseclean.domain.model.News
import io.reactivex.Single

interface NewsRepository {
    fun fetchLatestNews(): Single<List<News>>
}