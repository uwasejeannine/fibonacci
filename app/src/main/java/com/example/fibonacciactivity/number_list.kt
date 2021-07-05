package com.example.fibonacciactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger


class number_list(public var numberList:List<BigInteger>):RecyclerView.Adapter<number_list.NumberRecyclerView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberRecyclerView {
        var num=LayoutInflater.from(parent.context).inflate(R.layout.number_list,
        parent,false)
       return NumberRecyclerView(num)
    }

    override fun onBindViewHolder(holder: NumberRecyclerView, position: Int) {
        holder.tvnumber_list.text=numberList.get(position).toString()

    }
    override fun getItemCount(): Int {
        return numberList.size
    }

    class NumberRecyclerView(num:View):RecyclerView.ViewHolder(num){
        var tvnumber_list=num.findViewById<TextView>(R.id.tvnumberList)
    }

}
