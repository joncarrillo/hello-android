package me.jfcarrillo.helloworldjfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
        val loading = findViewById<ProgressBar>(R.id.loading)

        login.isEnabled = true

        login.setOnClickListener {
            loading.visibility = View.VISIBLE

            if (username.text.toString() == "jfc" && password.text.toString() == "123") {
                Toast.makeText(applicationContext, "Correcto", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,ProductsActivity::class.java))
                finish()
            } else {
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                loading.visibility = View.GONE
            }
        }


    }
}