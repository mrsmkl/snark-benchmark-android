package org.celo.snarkbenchmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        System.loadLibrary("snark_prove_benchmark_ndk")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var view = findViewById<TextView>(R.id.messageField)
        view.text = "Running benchmark, this will take few minutes"
        var a = Bench()
        var r = a.runBench()
        view.text = r
    }
}