package jp.techacademy.fumito.ikemoto.aisatuapp

import android.app.TimePickerDialog
import android.util.Log
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialogButton.setOnClickListener()
        {
            openTimePickerDialog()
        }
    }

    private fun openTimePickerDialog()
    {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hour, _ ->
                var greetingText = generateGreetingText(hour)
                timeText.text = greetingText
            },
            12, 0, true)
        timePickerDialog.show()
    }

    private fun generateGreetingText(hour : Int) : String
    {
        when(hour)
        {
            in 2 until 10 -> return "おはよう"
            in 10 until 18 -> return "こんにちは"
            else -> return "こんばんは"
        }
    }

}
