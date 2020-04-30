package com.ctyeung.interviewex.Sealed

sealed class Response<out R>
class Success<R>(val value: R): Response<R>()
class Failure(val error: Throwable): Response<Nothing>()


fun handle(response: Response<String>) {
    val text = when (response) {
        is Success -> "Success, data are: " + response.value
        is Failure -> "Error"
    }
    print(text)
}