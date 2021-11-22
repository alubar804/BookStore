package com.example.bookstore.ui.synopsis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bookstore.databinding.FragmentSynopsisBinding

class SynopsisFragment : Fragment() {

    private lateinit var synopsisViewModel: SynopsisViewModel
    private var _binding: FragmentSynopsisBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        synopsisViewModel =
            ViewModelProvider(this).get(SynopsisViewModel::class.java)

        _binding = FragmentSynopsisBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSynopsis
        synopsisViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}