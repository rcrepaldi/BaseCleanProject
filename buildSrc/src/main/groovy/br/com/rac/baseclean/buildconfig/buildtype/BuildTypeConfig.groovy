package br.com.rac.baseclean.buildconfig.buildtype

abstract class BuildTypeConfig {

    abstract boolean isMinifyEnabled()

    abstract boolean isShrinkResourcesEnabled()

    abstract List<String> getProguardFiles()
}