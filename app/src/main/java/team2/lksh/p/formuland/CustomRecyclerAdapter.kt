package team2.lksh.p.formuland

import android.app.Activity
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.formul_row.view.*

class CustomRecyclerAdapter(val intent: Intent) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.formul_row, parent, false)

//        cellForRow.setOnClickListener {
//            cellForRow.text_big.text = "Clicked!!!"
////            startActivity()
//
//        }

//        cellForRow.setOnClickListener(::onClick)

        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val v = holder.itemView
    }
}

class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v)