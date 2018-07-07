package team2.lksh.p.formuland.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.support.v7.widget.RecyclerView
import team2.lksh.p.formuland.R

class FormulsAdapter : RecyclerView.Adapter<ArgViewHolder>() {

    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.formul_row, parent, false)
        return ArgViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: ArgViewHolder, position: Int) {
        val v = holder.itemView
    }
}

class FormulaViewHolder(v: View) : RecyclerView.ViewHolder(v)