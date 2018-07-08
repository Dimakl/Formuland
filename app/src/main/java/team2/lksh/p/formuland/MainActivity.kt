package team2.lksh.p.formuland

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import team2.lksh.p.formuland.parser.FormulaAnalyzer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, FormulsListActivity::class.java)
        startActivity(intent)


        math.setOnClickListener{startActivity(Intent(this, FormulsListActivity::class.java))}

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true
    }

}
