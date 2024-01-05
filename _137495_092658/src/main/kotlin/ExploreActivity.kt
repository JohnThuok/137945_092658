import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.DetailsActivity
import com.example.recipeapp.R

class ExploreActivity : AppCompatActivity(), RecipeAdapter.OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        // Dummy data (replace this with your actual recipe data)
        val recipeList = listOf(
            Recipe("Pancakes", "Breakfast"),
            Recipe("Chicken Curry", "Lunch"),
            Recipe("Spaghetti Bolognese", "Dinner"),
            Recipe("Avocado Toast", "Breakfast"),
            Recipe("Caesar Salad", "Lunch"),
            Recipe("Grilled Salmon", "Dinner"),
            Recipe("Oatmeal", "Breakfast"),
            Recipe("Vegetable Stir Fry", "Dinner"),
            Recipe("Fruit Salad", "Snack"),
            Recipe("Egg Sandwich", "Breakfast"),
        )

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize and set the adapter
        recipeAdapter = RecipeAdapter(recipeList, this)
        recyclerView.adapter = recipeAdapter
    }

    override fun onItemClick(recipe: Recipe) {
        // Handle item click, navigate to Recipe Details page
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("recipe", recipe) // Pass the recipe object to the details activity
        startActivity(intent)
    }
}
