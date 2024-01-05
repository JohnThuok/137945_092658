import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.ExploreActivity

class WelcomeActivity : AppCompatActivity() {

    // Delay time in milliseconds
    private val SPLASH_DELAY: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Use Handler to delay the transition to the next activity
        Handler().postDelayed({
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }
}
