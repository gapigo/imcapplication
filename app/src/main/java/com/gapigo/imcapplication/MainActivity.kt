package com.gapigo.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecyclell", "CREATE - estou criando a tela")
        // finish() // pula direto para o onDestroy()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecyclell", "START - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecyclell", "RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecyclell", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecyclell", "STOP - a tela não está mais visível mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecyclell", "RESTART - a tela está retornando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecyclell", "DESTROY - a tela foi destruída")
    }
}