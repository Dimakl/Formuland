package team2.lksh.p.formuland

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_formul.*
import team2.lksh.p.formuland.adapters.ArgumentsAdapter

class MainFormulaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_formul)

        val msg = intent.getStringExtra("key")

        args.layoutManager = LinearLayoutManager(this)
        args.adapter = ArgumentsAdapter()
    }
}
