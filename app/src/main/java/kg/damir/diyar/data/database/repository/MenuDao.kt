package kg.damir.diyar.data.database.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kg.damir.diyar.data.database.model.MenuDbModel

@Dao
interface MenuDao {
//    @Query("SELECT * FROM full_price_list ORDER BY lastUpdate DESC")
//    fun getPriceList(): LiveData<List<CoinInfoDbModel>>
//
    @Query("SELECT * FROM menu ")
    fun getMenuList(): LiveData<List<MenuDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMenuList(menuList: List<MenuDbModel>)
}
