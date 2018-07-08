package team2.lksh.p.formuland

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import team2.lksh.p.formuland.parser.FormulaAnalyzer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        math.setOnClickListener{startActivity(Intent(this, FormulsListActivity::class.java))}

    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
            true
        }

        R.id.action_favorite -> {
            // User chose the "Favorite" action, mark the current item
            // as a favorite...
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true
    }

    /*   override fun onOptionsItemSelected(item: MenuItem): Boolean {
           val id = item.itemId
           val headerView = findViewById<View>(R.id.header) as TextView
           when (id) {
               R.id.math -> {
                   headerView.text = "Математика"
                   return true
               }
               R.id.physics -> {
                   headerView.text = "Физика"
                   return true
               }
               R.id.chemistry -> {
                   headerView.text = "Химия"
                   return true
               }
           }
           return super.onOptionsItemSelected(item)
       }*/
}
