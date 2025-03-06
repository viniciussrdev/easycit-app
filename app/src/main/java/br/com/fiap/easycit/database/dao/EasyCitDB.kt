package br.com.fiap.easycit.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.easycit.model.Usuario

@Database(
    entities = [Usuario::class],
    version = 1
)
abstract class EasyCitDatabase : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao

    companion object {
        private lateinit var instance: EasyCitDatabase

        fun getDatabase(context: Context): EasyCitDatabase {

            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        EasyCitDatabase::class.java,
                        "app_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration() // * Destrói o banco a cada uso
                    .build()
            }
            return instance
        }
    }
}