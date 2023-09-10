package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UsersPrivateAppSettingsInfo(
    @SerializedName("file_upload_api_url") @Expose var file_upload_api_url: String = "",
    @SerializedName("file_upload_api_key") @Expose var file_upload_api_key: String = ""
)