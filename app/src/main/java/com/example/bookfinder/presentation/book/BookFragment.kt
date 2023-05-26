package com.example.bookfinder.presentation.book

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.bookfinder.R
import com.example.bookfinder.databinding.FragmentBookBinding
import com.example.bookfinder.databinding.FragmentResultBinding
import com.example.bookfinder.presentation.result.ResultFragmentArgs
import com.example.bookfinder.presentation.result.ResultViewModel

class BookFragment : Fragment() {

    private var _binding: FragmentBookBinding? = null
    private val binding get() = _binding!!
    private val args: BookFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBookBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(requireContext()).load(args.bookInfo.volumeInfo?.imageLinks?.thumbnail)
            .into(binding.coverImageView)

        binding.nameTextView.text = args.bookInfo.volumeInfo?.title
        binding.authorTextView.text = args.bookInfo.volumeInfo?.authors?.first()
        binding.descriptionTextView.text = args.bookInfo.volumeInfo?.description
        binding.publisherTextView.text = args.bookInfo.volumeInfo?.publisher
        binding.dateTextView.text = args.bookInfo.volumeInfo?.publishedDate
    }
}