package br.com.nathaliezago.primeiraaula0902

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ShareCompat

class SplashActivity : AppCompatActivity() {
    //val = variável imutável, L é a medida de tempo
    val TEMPO_SPLASH = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar(){
    //orderar ao Handler que dps de certo tempo, vc deve executar o splash.
        // Colocar o carregar() no override fun pra essa função ser chamada.
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, TEMPO_SPLASH)

    }
}
