package br.com.rac.baseclean.presentation.internal.di

import br.com.rac.baseclean.presentation.internal.di.scope.ServiceScope
import dagger.Subcomponent

@ServiceScope
@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent