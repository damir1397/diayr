package kg.damir.diyar.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "price")
data class PriceContainerDbModel(
    @PrimaryKey
    var priceId: Long = 0L,
    var price: Int = 0
)
