package io.seroo.core.common

sealed class FunResult<out T> {
    data class Success<out T>(val data: T) : FunResult<T>()
    data class Error(val error: Throwable) : FunResult<Nothing>()

    companion object {
        fun <T> safeCall(f: () -> T): FunResult<T> = try {
            Success(f.invoke())
        } catch (e: Exception) {
            Error(e)
        }
    }
}

fun <T, R> FunResult<T>.map(f: (T) -> R): FunResult<R> = when (this) {
    is FunResult.Success<T> -> FunResult.Success(f.invoke(data))
    is FunResult.Error -> this
}

fun <T, R> FunResult<T>.flatMap(f: (T) -> FunResult<R>): FunResult<R> = when (this) {
    is FunResult.Success -> f.invoke(data)
    is FunResult.Error -> this
}

fun <T> FunResult<T>.fold(success: (T) -> Unit, failure: (Throwable) -> Unit) = when (this) {
    is FunResult.Success -> success.invoke(data)
    is FunResult.Error -> failure.invoke(error)
}