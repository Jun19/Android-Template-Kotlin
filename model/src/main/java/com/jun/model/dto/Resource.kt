package com.jun.model.dto

import com.jun.common.exception.DataException


sealed class Resource<T>(
    val data: T? = null,
    val dataException: DataException? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Failure<T>(dataException: DataException) : Resource<T>(null, dataException)

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Failure -> "Failure[exception=$dataException]"
            is Loading<T> -> "Loading"
        }
    }
}