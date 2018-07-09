package team2.lksh.p.formuland.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.argument_row.view.*
import team2.lksh.p.formuland.R

class ArgumentsAdapter(val variables: List<String>) : RecyclerView.Adapter<CustomViewHolder>() {

    var cardList: MutableList<View> = mutableListOf()

    override fun getItemCount(): Int {
        return variables.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.argument_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val v = holder.itemView

        v.arg.text = variables[position].toUpperCase()
        v.variable.text = variables[position]
        v.pos.text = position.toString()

        cardList.add(v)
    }
}

open class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v)