package mohagheghi.mahdi.bomberjacket.data.local.db

import android.content.Context
import androidx.room.Room

class DatabaseHelper {

    companion object {
        private const val DATABASE_NAME = "app_local_db"

        fun initDb(appContext: Context): AppDatabase =
            Room.databaseBuilder(appContext, AppDatabase::class.java, DATABASE_NAME)
                .build()
    }
}