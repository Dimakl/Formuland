package team2.lksh.p.formuland

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_formul_list.*
import kotlinx.android.synthetic.main.formul_row.view.*

class FormulsListActivity : AppCompatActivity() {

    fun onItemClick(v : View) {
        v.text_big.text = "Clicked!!!"

        val a = Intent(this, MainFormulaActivity::class.java)
        startActivity(a)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formul_list)


        list.layoutManager = LinearLayoutManager(this)
        list.adapter = FormulsAdapter()
    }
}
