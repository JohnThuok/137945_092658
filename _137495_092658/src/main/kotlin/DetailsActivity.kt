import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val mealTypeTextView: TextView = findViewById(R.id.mealTypeTextView)

        // Retrieve recipe details from Intent
        val recipe = intent.getSerializableExtra("recipe") as? Recipe
        if (recipe != null) {
            // Set values to UI elements
            titleTextView.text = recipe.title
            mealTypeTextView.text = "Meal Type: ${recipe.mealType}"
            // Add more code to set other recipe details
        }
    }
}
