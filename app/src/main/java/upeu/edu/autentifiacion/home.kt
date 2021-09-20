package upeu.edu.autentifiacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class home : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tv = findViewById(R.id.mail)
        btn1 = findViewById(R.id.logout)

        var user=intent.extras
        val dato=user?.getString("usuario")
        tv.text=dato.toString()
        btn1.setOnClickListener {
            finish()
        }
    }
}