package di2k.csi.kotlinbasiclistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data will be view on the ListView
        val languages = listOf("Java","Kotlin","Javascript","PHP","Python")

        //given adapter to ListView
        lv_languages.adapter = ArrayAdapter(this, Int.MAX_VALUE, languages)

        //take item when onclick
        lv_languages.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, "You choice: ${languages[position]}", Toast.LENGTH_SHORT).show()}


    }
}
