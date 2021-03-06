package br.com.rac.baseclean.buildconfig.productflavor

/**
 * All methods of this class should return null and cannot be abstract, because
 * of dimension conflicts
 */
abstract class ProductFlavorConfig {

    Integer getMinSdkVersion() {
        return null
    }

    String isOkHttpLogEnabled() {
        return null
    }

    String isEventLogEnabled() {
        return null
    }
}