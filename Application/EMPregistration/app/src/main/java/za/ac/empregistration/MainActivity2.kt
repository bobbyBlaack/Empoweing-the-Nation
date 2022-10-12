package za.ac.empregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnSignIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnSignIn=findViewById(R.id.btnSignin)

        btnSignIn.setOnClickListener{
            val intent= Intent(this, Page3ASCII::class.java)
            startActivity(intent)
        }
    }
}