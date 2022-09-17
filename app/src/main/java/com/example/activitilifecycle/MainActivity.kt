package com.example.activitilifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ejecutando .... OnCREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Ejecutando .... OnSTART")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Ejecutando .... OnRESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Ejecutando .... OnPAUSE")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Ejecutando .... OnRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Ejecutando .... onSTOP")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "Ejecutando .... onDESTROY\n\tTAKE ME HOOOME TO THE PLACE \n\tI BELOONG")
    }
}