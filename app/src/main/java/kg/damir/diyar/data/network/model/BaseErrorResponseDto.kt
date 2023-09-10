package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseErrorResponseDto(
    @SerializedName("timestamp") @Expose val timestamp: String = "",
    @SerializedName("status") @Expose val status: Int = 0,
    @SerializedName("error") @Expose val error: String = "",
    @SerializedName("message") @Expose val message: String = "",
    @SerializedName("path") @Expose val path: String = ""
)
