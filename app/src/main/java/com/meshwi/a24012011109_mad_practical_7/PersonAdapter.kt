package com.meshwi.a24012011109_mad_practical_7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(
    private val personList: ArrayList<Person>
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name = itemView.findViewById<TextView>(R.id.textView2)
        val phone = itemView.findViewById<TextView>(R.id.textView3)
        val email = itemView.findViewById<TextView>(R.id.textView4)
        val address = itemView.findViewById<TextView>(R.id.textView5)
        val delete = itemView.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_item, parent, false)

        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: PersonViewHolder,
        position: Int
    ) {

        val person = personList[position]

        holder.name.text = person.name
        holder.phone.text = person.phoneNo
        holder.email.text = person.emailId
        holder.address.text = person.address

        holder.delete.setOnClickListener {

            personList.removeAt(holder.adapterPosition)

            notifyItemRemoved(holder.adapterPosition)
        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }
}