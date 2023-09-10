package kg.damir.diyar.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WorkTimeDto(
    @SerializedName("working") @Expose val working: Boolean? = null,
    @SerializedName("work_time_begin") @Expose val work_time_begin: String? = null,
    @SerializedName("work_time_finish") @Expose val work_time_finish: String? = null
)