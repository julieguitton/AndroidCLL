package com.example.androidcll.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcll.R
import com.example.androidcll.model.Order

class OrderAdapter(private val orderList: List<Order>) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textOrderNumber:  TextView = itemView.findViewById(R.id.textOrderNumber)
        val textClientName: TextView = itemView.findViewById(R.id.textClientName)
        val textDeliveryAddress: TextView = itemView.findViewById(R.id.textDeliveryAddress)
        val textStatus: TextView = itemView.findViewById(R.id.textStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val order = orderList[position]
        holder.textOrderNumber.text = "Commande n° ${order.id}"
        holder.textClientName.text = order.clientName
        holder.textDeliveryAddress.text = "Adresse : ${order.deliveryAddress}"
        holder.textStatus.text = "Status : ${order.status}"
    }

    override fun getItemCount() = orderList.size
}
