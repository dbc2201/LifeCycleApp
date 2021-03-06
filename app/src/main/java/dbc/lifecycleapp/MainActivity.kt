package dbc.lifecycleapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            this,
            "onCreate() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this,
            "onStart() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this,
            "onResume() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this,
            "onPause() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this,
            "onStop() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(
            this,
            "the activity has been restarted; the onRestart() function is called",
            Toast.LENGTH_SHORT
        ).show()
    }
}