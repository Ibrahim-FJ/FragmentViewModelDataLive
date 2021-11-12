package com.example.fragmentviewmodeldatalive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.fragmentviewmodeldatalive.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.textView.text = viewModel.score.toString()
        binding.button.setOnClickListener {
            viewModel.printScore()
           binding.textView.text = viewModel.score.toString()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding =
            null         //  reset the _binding property to null, as the view no longer exists.
    }

}