package br.com.rac.baseclean.buildconfig.productflavor

class DevelopmentEnvironmentProductFlavor extends ProductFlavorConfig {

    @Override
    String isOkHttpLogEnabled() {
        return true.toString()
    }

    @Override
    String isEventLogEnabled() {
        return true.toString()
    }
}