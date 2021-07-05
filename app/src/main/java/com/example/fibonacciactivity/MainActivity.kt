package com.example.fibonacciactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvListNumbers = findViewById<RecyclerView>(R.id.rvListNumbers)
        rvListNumbers.layoutManager = LinearLayoutManager(baseContext)
        rvListNumbers.adapter = number_list(fibonacci(100))
    }
}
fun fibonacci(numbers: Int):List<BigInteger>{
    var nums= MutableList<BigInteger>(numbers,{BigInteger.ZERO })
    var number2=BigInteger.ZERO
    var number3=BigInteger.ONE
    nums[0]=number2
    nums[1]=number3
    for(a in 1..numbers){
        var sum=number2+number3
        number2=number3
        number3=sum
        nums[a-1]=number2

    }
    return nums
}