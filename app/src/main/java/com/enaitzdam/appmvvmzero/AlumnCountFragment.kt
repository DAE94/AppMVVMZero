package com.enaitzdam.appmvvmzero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.viewModels
import com.enaitzdam.appmvvmzero.databinding.FragmentAlumnCountBinding
import com.enaitzdam.appmvvmzero.databinding.FragmentHomeBinding
import kotlin.getValue


class AlumnCountFragment : Fragment() {

    private val viewModel: AlumnViewModel by viewModels()
    private lateinit var binding: FragmentAlumnCountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAlumnCountBinding.inflate(inflater)

        binding.button.setOnClickListener {

            if (binding.inputEdat.text.toString() != "") {
                viewModel.countAlumns(binding.inputEdat.text.toString().toInt())
                binding.textView.text = viewModel.alumnNumber.toString()
            }
        }

        return binding.root

    }
}