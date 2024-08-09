package com.mimeda.mlinkmobile.network

internal class ErrorHandler {
    fun getError(response: BaseResponse<*>?): MlinkError {
        response?.meta?.let { meta ->
            return if (meta.errorCode == null)
                MlinkError.UnexpectedException()
            else {
                MlinkError.UnexpectedException()
            }
        }
        return MlinkError.UnexpectedException()
    }
}