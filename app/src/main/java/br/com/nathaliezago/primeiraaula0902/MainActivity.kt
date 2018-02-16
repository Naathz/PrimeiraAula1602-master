package br.com.nathaliezago.primeiraaula0902

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener {
            val geradorNumero = Random()

            label.text = geradorNumero.nextInt(50).toString()

        }

    }
}
