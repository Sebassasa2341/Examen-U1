package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edC: EditText
    lateinit var edF: EditText
    var result0: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edC = findViewById(R.id.edC);
        edF = findViewById(R.id.edF);
        var btnC: Button = findViewById(R.id.btnC)
        var btnF: Button = findViewById(R.id.btnF)

        btnC.setOnClickListener{
            var temp: Double = edF.text.toString().toDouble()
            result0 = (temp - 32) / 1.8
            edC.setText(result0.toString())
        }

        btnF.setOnClickListener{
            var temp: Double = edC.text.toString().toDouble()
            result0 = (temp * 1.8) + 32
            edF.setText(result0.toString())
        }
    }
}