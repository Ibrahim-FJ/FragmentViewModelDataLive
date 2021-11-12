package com.example.fragmentviewmodeldatalive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.score = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.button.setOnClickListener {
            viewModel.printScore()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding =
            null         //  reset the _binding property to null, as the view no longer exists.
    }

}