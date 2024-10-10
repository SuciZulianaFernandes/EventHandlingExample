package id.ac.polbeng.sucizulianaf.eventhandlingexample

import com.google.android.material.snackbar.Snackbar
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import id.ac.polbeng.sucizulianaf.eventhandlingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext, "Hello World",
                Toast.LENGTH_LONG
            ).show()
        }
        binding.btnDisplayMessage.setOnLongClickListener {

            Snackbar.make(binding.rootLayout, "Long Click",
                Snackbar.LENGTH_LONG).show()
            true
        }
    }
}