package me.baymallow.example.baymax

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val readingBtn = findViewById<Button>(R.id.button_reading)
        val videoBtn = findViewById<Button>(R.id.button_cinematic)
        val searchBtn = findViewById<ImageButton>(R.id.button_search)
        val submitBtn = findViewById<Button>(R.id.button_submit)

        readingBtn.setOnClickListener({
            val intent = Intent(applicationContext, ReadingActivity::class.java)
            startActivity(intent)
        })

        videoBtn.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=0ecv0bT9DEo"))
            startActivity(intent)
        })

        searchBtn.setOnClickListener({
            val intent = Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://namu.wiki/w/히어로즈%20오브%20더%20스톰"))
            startActivity(intent)
        })

        submitBtn.setOnClickListener({
            if(findViewById<CheckBox>(R.id.check_agree).isChecked) {
                val str = (findViewById<EditText>(R.id.input_text_2)).text.toString()
                if(str.length >= 1) {
                    val intent = Intent(Intent.ACTION_SEND)
                    intent.type = "text/plain"
                    intent.putExtra(Intent.EXTRA_SUBJECT, "시.공.조.아. 특강 에세이 제출")
                            .putExtra(Intent.EXTRA_TEXT, str)
                            .putExtra(Intent.EXTRA_EMAIL, arrayOf("16016.ksa@gmail.com"))
                    startActivity(intent)
                }else{
                    Toast.makeText(baseContext, "분량이 부족합니다", Toast.LENGTH_LONG).show()
                }
            }else{
                Toast.makeText(baseContext, "동의가 필요합니다", Toast.LENGTH_LONG).show()
            }
        })
    }
}
