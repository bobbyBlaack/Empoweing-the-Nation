package za.ac.empregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var Etfullname:EditText
    private lateinit var ETemail:EditText
    private lateinit var ETphone:EditText
    private lateinit var ETcource:EditText
    private lateinit var ETpayplan:EditText
    private lateinit var ETpassword:EditText
    private lateinit var ETrepassword:EditText
    private lateinit var btnSignin:Button
    private lateinit var btnCreAcc:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Etfullname=findViewById(R.id.ETfullname)
        ETemail=findViewById(R.id.ETemail)
        ETphone=findViewById(R.id.ETphone)
        ETcource=findViewById(R.id.ETcource)
        ETpayplan=findViewById(R.id.ETpayplan)
        ETpassword=findViewById(R.id.ETpassword)
        ETrepassword=findViewById(R.id.ETrepassword)
        btnSignin=findViewById(R.id.btnSignin)
        btnCreAcc=findViewById(R.id.btnCreAcc)

        var ETfullname=Etfullname.text
        var ETemil=ETemail.text
        var ETphone= ETphone.text
        var ETcource= ETcource.text
        var ETpayplan= ETpayplan.text
        var ETpassword=ETpassword.text
        var ETrepassword=ETrepassword.text

        btnSignin.setOnClickListener{
            val intent=Intent(this, Page2ASCII::class.java)
            startActivity(intent)
        }
        btnCreAcc.setOnClickListener {
            val intent=Intent(this, Page3ASCII::class.java)
            startActivity(intent)
        }
    }
}