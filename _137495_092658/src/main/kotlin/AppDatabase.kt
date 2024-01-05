import android.content.Context
import androidx.room.Room

object AppDatabase {

    private var instance: RecipeDatabase? = null

    fun getInstance(context: Context): RecipeDatabase {
        if (instance == null) {
            synchronized(RecipeDatabase::class) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDatabase::class.java,
                    "recipe_database"
                ).build()
            }
        }
        return instance!!
    }
}
