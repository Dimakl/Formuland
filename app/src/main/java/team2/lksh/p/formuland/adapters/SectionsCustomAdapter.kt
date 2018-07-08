package team2.lksh.p.formuland.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.section_row.view.*
import team2.lksh.p.formuland.R
import javax.security.auth.Subject

class SectionsCustomAdapter(val subjects : List<String>) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun getItemCount(): Int {
        return subjects.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.itemView.subject.text = subjects[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val cellForRow = layoutInflater.inflate(R.layout.section_row, parent, false)
        return CustomViewHolder(cellForRow)
    }
}