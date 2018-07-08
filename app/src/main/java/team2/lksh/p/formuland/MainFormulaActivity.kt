package team2.lksh.p.formuland

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_formul.*
import team2.lksh.p.formuland.adapters.ArgumentsAdapter
import java.util.*

fun findElem(n : Int, arr : List<Int>) : Int {
    for (i in 0..arr.size) {
        if (arr[i] == n) {
            return i
        }
    }
    return -1
}

class MainFormulaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_formul)

        val index = intent.getStringExtra("index").toInt()

        test1.text = index.toString()

        val menuData = getMenuData(this, JsonData.mathBase)


        val rangeIndex = findElem(index, menuData.idList)

        val name = menuData.names[rangeIndex]
        val imgName = menuData.images[rangeIndex]
        val vars = getExprVars(this, rangeIndex)

        test2.text = name
        test3.text = imgName
        test4.text = Arrays.toString(vars.toTypedArray())

        args.layoutManager = LinearLayoutManager(this)
        args.adapter = ArgumentsAdapter()
    }
}
