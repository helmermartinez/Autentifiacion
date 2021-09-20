package upeu.edu.autentifiacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var em: EditText
    lateinit var pass: EditText
    lateinit var btn: Button
    lateinit var sw: Switch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        em = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        btn = findViewById(R.id.validar)
        sw = findViewById(R.id.switch1)


        btn.setOnClickListener {

           if(em.text.toString().equals("helmer") && pass.text.toString().equals("123"))
          {
            val intento=Intent(this,home::class.java)
            intento.putExtra("usuario",em.text.toString())
             startActivity(intento)
           }else{
               Toast.makeText(this, "Username or Password Incorrect", Toast.LENGTH_LONG).show()
           }
        }
    }
}
