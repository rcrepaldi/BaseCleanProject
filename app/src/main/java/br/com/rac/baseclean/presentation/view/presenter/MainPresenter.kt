package br.com.rac.baseclean.presentation.view.presenter

import br.com.rac.baseclean.presentation.view.MainContract
import javax.inject.Inject

class MainPresenter @Inject constructor() : BasePresenter<MainContract.View>(), MainContract.Presenter {

    override fun onNewsButtonClick() {
        view?.redirectLatestNews()
    }
}
