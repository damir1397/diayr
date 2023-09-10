package kg.damir.diyar.data.database.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kg.damir.diyar.data.database.model.MenuCategoryDbModel

@Dao
interface MenuCategoryDao {
    @Query("SELECT * FROM menu_category ")
    fun getMenuCategory(): LiveData<List<MenuCategoryDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMenuCategoryList(menuCategoryList: List<MenuCategoryDbModel>)
}