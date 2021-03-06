@file:Suppress("unused")
package br.com.rac.baseclean.presentation.util.extension

fun Any.notEqualTo(any: Any?): Boolean = !equals(any)

val Any.TAG: String
    get() = this.javaClass.simpleName