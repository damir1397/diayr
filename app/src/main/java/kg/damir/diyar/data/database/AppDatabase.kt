package kg.damir.diyar.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kg.damir.diyar.data.database.model.MenuCategoryDbModel
import kg.damir.diyar.data.database.model.MenuDbModel
import kg.damir.diyar.data.database.model.PriceContainerDbModel
import kg.damir.diyar.data.database.repository.MenuCategoryDao
import kg.damir.diyar.data.database.repository.MenuDao

@Database(
    entities = [
        MenuDbModel::class,
        MenuCategoryDbModel::class,
        PriceContainerDbModel::class
    ], version = 7, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    companion object {

        private var db: AppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context: Context): AppDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        DB_NAME
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                db = instance
                return instance
            }
        }
    }

    abstract fun menuDao(): MenuDao
    abstract fun menuCategoryDao(): MenuCategoryDao
}
