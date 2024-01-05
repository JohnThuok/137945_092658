import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {

    @Insert
    suspend fun insertRecipe(recipe: RecipeEntity)

    @Query("SELECT * FROM recipes")
    suspend fun getAllRecipes(): List<RecipeEntity>

    // Add more queries as needed for updating, deleting, etc.
}
