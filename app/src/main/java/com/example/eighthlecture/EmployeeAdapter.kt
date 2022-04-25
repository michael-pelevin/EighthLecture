package com.example.eighthlecture

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class EmployeeAdapter(private val deleteAction: (Int) -> Unit) : RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    private val employees = mutableListOf<Employee>()

    class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoImageView: ImageView = itemView.findViewById(R.id.photo)
        val fullnameTextView: TextView = itemView.findViewById(R.id.fullname)
        val departmentTextView: TextView = itemView.findViewById(R.id.department)
        val deleteButton: ImageView = itemView.findViewById(R.id.delete_button)
        val favButton: ImageView = itemView.findViewById(R.id.fav_button)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EmployeeViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.employee_list_item, parent, false)
        return EmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = employees[position]
        with(holder) {
            fullnameTextView.text = employee.fullName
            departmentTextView.text = employee.department

            Glide.with(photoImageView.context)
                .load(employee.photoUrl)
                .centerCrop()
                .into(photoImageView)
            deleteButton.setOnClickListener{
                deleteAction(position)
            }

            favButton.setOnClickListener{
//                favouriteAction(position)
                if(employee.isFavourite){
                    holder.favButton.setImageResource(R.drawable.ic_fav)
                    employee.isFavourite = false
                } else{
                    holder.favButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    employee.isFavourite = true
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    fun reload(data: List<Employee>){
        val diffUtilCallback = EmployeesDiffUtilCallback(employees, data)
        val employeeDiffResult = DiffUtil.calculateDiff(diffUtilCallback)
        employees.clear()
        employees.addAll(data)
        employeeDiffResult.dispatchUpdatesTo(this)

    }
}