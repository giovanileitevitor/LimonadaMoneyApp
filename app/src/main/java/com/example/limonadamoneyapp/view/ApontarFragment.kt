package com.example.limonadamoneyapp.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.limonadamoneyapp.R
import kotlinx.android.synthetic.main.fragment_apontar.*

/**
 * A simple [Fragment] subclass.
 */
class ApontarFragment : Fragment() {

    //Init Spinner
    var list_of_tipo_gastos = listOf("-",  "Roupas",   "Alimentação",      "Moradia",
        "Celular",  "Carro - Moto - Uber",  "Pessoais", "Cartão de Crédito",
        "Empresa",  "Gasolina - Alcool",  "Outros")


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_apontar, container, true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    private fun init(view : View){
        initVars()
        initActions()
    }

    private fun initVars() {

        //Inicializa o Adapter que controla o Spinner
        val adapter = getContext()?.let {
            ArrayAdapter(it, android.R.layout.simple_spinner_item, list_of_tipo_gastos) }

        adapter?.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spn_tipo_gasto.adapter = adapter

        //txtDataHora.text = getDateTimeFull()

    }

    private fun initActions(){

    }

}
