package br.com.rac.baseclean.presentation.internal.di

import android.content.Context
import android.content.SharedPreferences
import br.com.rac.baseclean.BuildConfig
import br.com.rac.baseclean.presentation.util.connection.DefaultInternetConnectionVerifier
import br.com.rac.baseclean.presentation.util.connection.InternetConnectionVerifier
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val appApplication: AppApplication) {

    @Provides
    fun provideApplicationContext(): Context = appApplication

    @Provides
    fun provideInternetConnectionVerifier(context: Context): InternetConnectionVerifier = DefaultInternetConnectionVerifier(context)

    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences = context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
}