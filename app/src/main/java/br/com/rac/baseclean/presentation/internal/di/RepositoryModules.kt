package br.com.rac.baseclean.presentation.internal.di

import br.com.rac.baseclean.data.repository.NewsDataRepository
import br.com.rac.baseclean.domain.repository.NewsRepository
import br.com.rac.baseclean.presentation.internal.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class RepositoryModules {

    @Provides
    @ApplicationScope
    fun provideNewsRepository(repository: NewsDataRepository): NewsRepository = repository
}