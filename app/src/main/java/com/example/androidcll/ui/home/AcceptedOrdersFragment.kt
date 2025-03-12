package com.example.androidcll.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.androidcll.databinding.FragmentAcceptedOrdersBinding

class AcceptedOrdersFragment : Fragment() {

    private var _binding: FragmentAcceptedOrdersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val acceptedOrdersViewModel =
            ViewModelProvider(this).get(AcceptedOrdersViewModel::class.java)

        _binding = FragmentAcceptedOrdersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        acceptedOrdersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}