package br.com.rac.baseclean.presentation.util.analytics

import android.util.Log
import br.com.rac.baseclean.BuildConfig
import br.com.rac.baseclean.presentation.util.analytics.tracking.event.base.Event
import br.com.rac.baseclean.presentation.util.extension.TAG

object AnalyticsManager {

    fun trackEvent(event: Event) {
        if (BuildConfig.DEBUG) {
            logEvent(event)
            return
        }
    }

    private fun logEvent(event: Event) {
        if (BuildConfig.DEBUG) {
            Log.v(TAG, event.toString())
        }
    }
}