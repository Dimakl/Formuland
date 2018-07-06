package team2.lksh.p.formuland

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class CustomRecyclerAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.row, parent, false)

        cellForRow.setOnClickListener {
            cellForRow.text_big.text = "Clicked!!!"
        }

        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val v = holder.itemView
    }
}

class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v)