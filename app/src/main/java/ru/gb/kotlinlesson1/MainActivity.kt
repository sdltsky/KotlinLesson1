package ru.gb.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import ru.gb.kotlinlesson1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Employee("Ivan", "Engineer")

        val buttonExample = findViewById<Button>(R.id.button) as Button
        buttonExample.setOnClickListener {
            Toast.makeText(
                this,
                "Name: ${data.Name}, Position: ${data.Position}",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}