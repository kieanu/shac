package com.funch.shac.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import com.funch.shac.base.BaseFragment
import com.funch.shac.base.BaseViewModel
import com.funch.shac.databinding.FragmentHomeBinding
import com.funch.shac.presentation.viewmodel.HomeFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, BaseViewModel>() {
    override fun getViewBinding(): FragmentHomeBinding  = FragmentHomeBinding.inflate(layoutInflater)

    override val viewModel: HomeFragmentViewModel by viewModels()

//    @Inject
//    lateinit var userAdapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        val textView: TextView = binding.textHome
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        return binding.root
    }
}