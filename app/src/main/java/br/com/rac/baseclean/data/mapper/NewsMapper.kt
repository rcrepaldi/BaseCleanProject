package br.com.rac.baseclean.data.mapper

import br.com.rac.baseclean.data.model.NewsData
import br.com.rac.baseclean.domain.model.News
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    //TODO - map properly media URL
    fun map(newsData: NewsData) =
            News(url = newsData.url ?: "",
                    column = newsData.column ?: "",
                    section = newsData.section ?: "",
                    title = newsData.title ?: "",
                    source = newsData.source ?: "",
                    publishedDate = newsData.publishedDate ?: "",
                    mediaUrl = "http://via.placeholder.com/150x150",
                    mediaCaption = "")
}