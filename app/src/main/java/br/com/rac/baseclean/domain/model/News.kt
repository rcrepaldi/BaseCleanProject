@file:Suppress("unused")

package br.com.rac.baseclean.domain.model

import br.com.rac.baseclean.data.model.BaseDataModel

class News(val url: String,
           val column: String,
           val section: String,
           val title: String,
           val source: String,
           val publishedDate: String,
           val mediaUrl: String,
           val mediaCaption: String) : BaseDataModel()