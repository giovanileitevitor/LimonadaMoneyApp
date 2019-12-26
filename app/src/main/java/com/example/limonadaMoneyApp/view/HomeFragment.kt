package com.example.limonadaMoneyApp.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import com.example.limonadaMoneyApp.R
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    //Init Spinner
    var list_of_range = arrayOf("Acumulado", "Mensal", "Ultimos 3 meses", "Ultimos 6 meses", "Anual")
    var item_selecionado : String? = null

    //Init Graphic Labels
    val labels = arrayOf<String>("Alimentacao", "Moradia", "Pessoais", "Transporte", "Investimentos")


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)

    }

    private fun init(view: View){
        initVars()

        initActions()
    }


    private fun initVars(){

        //Seta o Spinner para - ATUAL
        val adapter = getContext()?.let {
            ArrayAdapter(it, android.R.layout.simple_spinner_item, list_of_range) }

        adapter?.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spn_periodo.adapter = adapter

        //Inicializa a variavel que contem dados default
        //loadDadosGrafico()

        //Seta os controles do PieChar
        setupBarChartData2()
    }

    private fun initActions(){

        //Açao do Spinner
        spn_periodo.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long){
                item_selecionado = parent.getItemAtPosition(position).toString()
            }
            override fun onNothingSelected(parent: AdapterView<*>){
                //
            }
        }

       //Açao do botão Apontar Gastos
        btnApontar.setOnClickListener { v ->
            //val args = Bundle().apply {}
            v.findNavController().navigate(R.id.action_homeFragment_to_ApontarFragment)
        }

        //Acao do botao Consultar Gastos
        btnConsultar.setOnClickListener { v ->
            //val args = Bundle().apply {}
            v.findNavController().navigate(R.id.action_homeFragment_to_ConsultarFragment)
        }

        btnAtualizar.setOnClickListener { v ->

        }
    }


    private fun setupBarChartData() {

        val bargroup = ArrayList<BarEntry>(5)
        var labels = ArrayList<String>(5)

        // inflate Y coordinate with Values
        bargroup.add(BarEntry(1f, 100f))
        bargroup.add(BarEntry(2f, 200f))
        bargroup.add(BarEntry(3f, 50f))
        bargroup.add(BarEntry(4f, 10f))
        bargroup.add(BarEntry(5f, 100f))

        var barDataSet = BarDataSet(bargroup, "Cells")

        //Inflate X coordinates labels
        labels[0] = "Alimentacao"
        labels[1] = "Moradia"
        labels[2] = "Pessoais"
        labels[3] = "Transporte"
        labels[4] = "Investimentos"

        //Inflate Colors on Labels

        var data = BarData(barDataSet)

        main_chart.data = data
        main_chart.description.text = "Gráfico"
        main_chart.animateY(500)

    }

    private fun setupBarChartData2() {
        // create BarEntry for Bar Group
        val bargroup = ArrayList<BarEntry>()
        bargroup.add(BarEntry(0f, 30f, labels[0]))
        bargroup.add(BarEntry(1f, 2f, labels[1]))
        bargroup.add(BarEntry(2f, 4f, labels[2]))
        bargroup.add(BarEntry(3f, 6f, labels[3]))
        bargroup.add(BarEntry(4f, 8f, labels[4]))

        // creating dataset for Bar Group
        val barDataSet = BarDataSet(bargroup, "")

        barDataSet.color = ContextCompat.getColor(requireContext(), R.color.colorPrimary)

        val data = BarData(barDataSet)
        main_chart.setData(data)
        main_chart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        main_chart.xAxis.labelCount = 5
        main_chart.xAxis.enableGridDashedLine(5f, 5f, 0f)
        main_chart.axisRight.enableGridDashedLine(5f, 5f, 0f)
        main_chart.axisLeft.enableGridDashedLine(5f, 5f, 0f)
        main_chart.description.isEnabled = false
        main_chart.animateY(1000)
        main_chart.legend.isEnabled = false
        main_chart.setPinchZoom(true)
        main_chart.data.setDrawValues(false)
    }
}
