package team2.lksh.p.formuland.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.support.v7.widget.RecyclerView
import team2.lksh.p.formuland.R

class ArgumentsAdapter : RecyclerView.Adapter<ArgViewHolder>() {

    override fun getItemCount(): Int {
        return 15
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.argument_row, parent, false)
        return ArgViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: ArgViewHolder, position: Int) {
        val v = holder.itemView
    }
}

class ArgViewHolder(v: View) : RecyclerView.ViewHolder(v)