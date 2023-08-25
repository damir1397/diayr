package kg.damir.diayr.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "price")
data class PriceContainerDbModel(
    @PrimaryKey
    var priceId: Long = 0L,
    var price: Int = 0
)
