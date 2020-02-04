package br.com.rac.baseclean.buildconfig.productflavor

class ProductionEnvironmentProductFlavor extends ProductFlavorConfig {

    @Override
    String isOkHttpLogEnabled() {
        return false.toString()
    }

    @Override
    String isEventLogEnabled() {
        return false.toString()
    }
}