package io.seroo.sampleerrorhandling.common

import kotlin.reflect.KClass

sealed class FunLocalError(message: String) : Throwable(message)

data class FunIOError(val _code: Int, val detail: FunIODetail) : FunLocalError(detail.name)

enum class FunIODetail(val errorCode: Int) {
    RESPONSE_FAIL(1),
    INVALID_DATA(3),
    EMPTY_DATA(4),
}