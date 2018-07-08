package team2.lksh.p.formuland.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.formul_row.view.*
import team2.lksh.p.formuland.R
import team2.lksh.p.formuland.getMenuData

class FormulsAdapter(activity: Context) : RecyclerView.Adapter<FormulaViewHolder>() {

    val data = getMenuData(activity, "math.base")

    override fun getItemCount(): Int {
        return data.indices.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FormulaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.formul_row, parent, false)
        return FormulaViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: FormulaViewHolder, position: Int) {
        val v = holder.itemView

        val title = data.names[position]
        val imgPath = data.images[position]
        holder.index = data.indices[position]

        v.title.text = title
        v.small_text.text = imgPath
    }
}
class FormulaViewHolder(v: View) : CustomViewHolder(v) {
    var index = -1
}