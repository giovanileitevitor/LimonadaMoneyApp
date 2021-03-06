package com.example.limonadamoneyapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        btnGo.setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.completeFragment)
//        )
        btnApontar.setOnClickListener { v ->
            val args = Bundle().apply {
                //putParcelable("person", Person("nglauber", 34))
            }
            v.findNavController().navigate(R.id.action_homeFragment_to_ApontarFragment, args)
        }

        btnConsultar.setOnClickListener { v ->
            val args = Bundle().apply {
                //putParcelable("person", Person("nglauber", 34))
            }
            v.findNavController().navigate(R.id.action_homeFragment_to_ConsultarFragment, args)
        }
    }

}
