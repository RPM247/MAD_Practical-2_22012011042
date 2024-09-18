package com.rpm24.mad_practical_2_22012011042

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showToastMessage("onCreate function called")
    }
    override fun onStart() {
        super.onStart()
        showSneckBarMessage("onStart function called")
    }
    override fun onResume() {
        super.onResume()
        showToastMessage("onResume function called")
    }
    override fun onPause() {
        super.onPause()
        showSneckBarMessage("onPause function called")
    }
    override fun onStop() {
        super.onStop()
        showToastMessage("onStop function called")
    }
    override fun onRestart() {
        super.onRestart()
        showSneckBarMessage("onRestart function called")
    }
    override fun onDestroy() {
        super.onDestroy()
        showToastMessage("onDestroy function called")
    }
    private fun showToastMessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    private fun showSneckBarMessage(msg:String){
        Log.i(TAG, msg)
        Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()
    }
}