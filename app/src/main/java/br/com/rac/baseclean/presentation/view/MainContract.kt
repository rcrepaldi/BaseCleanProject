package br.com.rac.baseclean.presentation.view

interface MainContract {

    interface View : BaseContract.View {
        fun redirectLatestNews()
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun onNewsButtonClick()
    }
}
