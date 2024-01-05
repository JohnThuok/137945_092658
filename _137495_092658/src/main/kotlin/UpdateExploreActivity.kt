import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.example.recipeapp.R

class ExploreActivity : AppCompatActivity(), RecipeAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize and set the adapter
        recipeAdapter = RecipeAdapter(emptyList(), this)
        recyclerView.adapter = recipeAdapter

        // Fetch recipes from Room database
        GlobalScope.launch(Dispatchers.Main) {
            val recipes = withContext(Dispatchers.IO) {
                AppDatabase.getInstance(this@ExploreActivity).recipeDao().getAllRecipes()
            }

            // Update the adapter with the fetched recipes
            recipeAdapter.updateData(recipes)
        }
    }

    override fun onItemClick(recipe: Recipe) {
        // Handle item click, navigate to Recipe Details page
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("recipe", recipe) // Pass the recipe object to the details activity
        startActivity(intent)
    }
}
