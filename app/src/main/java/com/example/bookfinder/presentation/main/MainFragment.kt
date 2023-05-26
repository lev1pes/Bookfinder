package com.example.bookfinder.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bookfinder.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.findBookButton.setOnClickListener {
            val text = binding.bookEditText.text.toString().trim()

            if (text.isNotEmpty()) {
                findNavController().navigate(
                    MainFragmentDirections.actionMainFragmentToResultFragment(text)
                )
            } else {
                Toast.makeText(requireContext(), "Enter book name!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}