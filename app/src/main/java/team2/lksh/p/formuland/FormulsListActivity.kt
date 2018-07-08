package team2.lksh.p.formuland

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_formul_list.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.formul_row.view.*
import kotlinx.android.synthetic.main.section_row.view.*
import team2.lksh.p.formuland.adapters.FormulsAdapter
import team2.lksh.p.formuland.adapters.SectionsCustomAdapter

class FormulsListActivity : AppCompatActivity() {

    private val subjectList = listOf("Mathematics", "Physics", "Chemistry")

    fun onFormulaClick(v : View) {

        val a = Intent(this, MainFormulaActivity::class.java)
        a.putExtra("id", v.pos_text.text)
        startActivity(a)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formul_list)

        setSupportActionBar(toolbar)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = FormulsAdapter(this, JsonData.mathBase)

        section_tab.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        section_tab.adapter = SectionsCustomAdapter(subjectList)
        
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    fun onSectionClick(v : View) {
        when(v.buttonSection.text) {
            subjectList[0] -> list.adapter = FormulsAdapter(this, JsonData.mathBase)
            subjectList[1] -> list.adapter = FormulsAdapter(this, JsonData.physicsBase)
        }
    }
}
