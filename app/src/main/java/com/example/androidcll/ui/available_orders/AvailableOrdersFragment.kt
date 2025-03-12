package com.example.androidcll.ui.available_orders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidcll.adapter.OrderAdapter
import com.example.androidcll.databinding.FragmentAvailableOrdersBinding
import com.example.androidcll.model.Order

class AvailableOrdersFragment : Fragment() {

    private var _binding: FragmentAvailableOrdersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val availableOrdersViewModel =
            ViewModelProvider(this).get(AvailableOrdersViewModel::class.java)

        _binding = FragmentAvailableOrdersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val orderList = listOf(
            Order("1DZIEA", "Alice Dupont", "12 rue de Paris, 66000 Perpignan", "Prête"),
            Order("2DKZZE", "Marc Durant", "45 avenue des Champs", "Prête"),
            Order("3DLZJL", "Sophie Martin", "67 boulevard Haussmann", "Prête")
        )
        // Configurer RecyclerView
        val recyclerView = binding.recyclerViewOrders
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = OrderAdapter(orderList)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}