package br.com.rac.baseclean.presentation.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.com.rac.baseclean.presentation.internal.di.AppApplication
import br.com.rac.baseclean.presentation.internal.di.ControllerComponent
import br.com.rac.baseclean.presentation.internal.di.ControllerModule
import br.com.rac.baseclean.presentation.util.extension.hide
import br.com.rac.baseclean.presentation.util.extension.show
import br.com.rac.baseclean.presentation.view.BaseContract
import kotlinx.android.synthetic.main.include_toolbar.*

abstract class BaseActivity<T, in V> : AppCompatActivity(), BaseContract.View where T : BaseContract.Presenter<V>, V : BaseContract.View {

    private var mControllerComponent: ControllerComponent? = null

    protected var presenter: T? = null
        set(value) {
            if (field == null) {
                field = value
            }
        }

    protected abstract fun createPresenter(): T

    @Suppress("UNCHECKED_CAST", "TooGenericExceptionThrown")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = this.createPresenter()
        try {
            presenter?.attachView(this as V)
        } catch (e: ClassCastException) {
            throw RuntimeException("Type V must be the same type of this class", e)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
        presenter?.detachView()
        presenter = null
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    protected fun initToolbar(title: String = "") {
        toolbar?.let {
            if (title.isNotEmpty()) {
                toolbar_title.show()
                toolbar_title.text = title
                toolbar.title = ""
            } else {
                toolbar_title.hide()
                toolbar.title = ""
            }
        }
    }

    protected fun getControllerComponent(): ControllerComponent {
        if (mControllerComponent == null) {
            mControllerComponent = (application as AppApplication).getApplicationComponent()
                    .newControllerComponent(ControllerModule(this))
        }
        return mControllerComponent!!
    }
}
