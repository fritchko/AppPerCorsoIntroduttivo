package com.example.introdevelhope

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.introdevelhope.databinding.ItemListBinding

class PersonAdapter(val personList: List<Person>): Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(val binding: ItemListBinding): ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val model = personList[position]

        holder.binding.imageView.setImageResource(model.image)
        holder.binding.textView.text = model.surname
        holder.binding.textView2.text = model.name

        holder.binding.imageView.setOnClickListener {
            holder.binding.imageView.animate().apply {
                duration = 500
                rotationBy(180f)
            }
        }

    }

}