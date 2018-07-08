package team2.lksh.p.formuland

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main_formul.*
import kotlinx.android.synthetic.main.argument_row.view.*
import team2.lksh.p.formuland.adapters.ArgumentsAdapter
import team2.lksh.p.formuland.adapters.getImgDrawable
import team2.lksh.p.formuland.parser.FormulaAnalyzer

fun findElem(n : Int, arr : List<Int>) : Int {
    for (i in 0..arr.size) {
        if (arr[i] == n) {
            return i
        }
    }
    return -1
}

class MainFormulaActivity : AppCompatActivity() {

    lateinit var adapter : ArgumentsAdapter
    var formulaId = -1
    private lateinit var jsonData : JsonDataProcessor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_formul)

        formulaId = intent.getStringExtra("id").toInt()

        jsonData = JsonDataProcessor(this)

        val menuData = jsonData.getMenuData(JsonData.mathBase)

        val index = findElem(formulaId, menuData.idList)

        val name = menuData.names[index]
        val imgName = menuData.images[index]
        val vars = jsonData.getExprVars(index)

        img_formula.setImageDrawable(getImgDrawable(this, imgName))

        val argAdapter = ArgumentsAdapter(vars)

        args.layoutManager = LinearLayoutManager(this)
        args.adapter = argAdapter

        adapter = argAdapter

    }

    fun onCalculate(v: View) {

        val pares : MutableMap<String, Double> = mutableMapOf()
        var unknownVar = ""

        for (view in adapter.cardList) {

            val variable = view.variable.text.toString()
            val input = view.arg_edit.text.toString()

//            Log.v("qqqqqqqqq", variable + "     " + input + "qw")

            if (input.isBlank()) {
                unknownVar = variable
            } else {
                pares[variable] = input.toDouble()
            }
        }

        val a = FormulaAnalyzer(jsonData.getExpr(formulaId).toMutableList(),jsonData)

        val res = a.run(pares, unknownVar)

        if (res != null) {
            answer.text = res
        } else {
            Log.i("eeeee", res + "kjdsfskjdfn")
        }

    }
}
