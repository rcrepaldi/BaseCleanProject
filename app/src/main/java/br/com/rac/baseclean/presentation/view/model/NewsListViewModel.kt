package br.com.rac.baseclean.presentation.view.model

import br.com.rac.baseclean.domain.model.News

class NewsListViewModel(val newsList: List<News>, val premium: Boolean = false)