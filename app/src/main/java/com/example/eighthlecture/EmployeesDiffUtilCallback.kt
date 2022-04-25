package com.example.eighthlecture

import androidx.recyclerview.widget.DiffUtil

class EmployeesDiffUtilCallback(oldEmployeeList: List<Employee>, newEmployeeList: List<Employee>): DiffUtil.Callback(){

    private var oldList = oldEmployeeList
    private var newList = newEmployeeList

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id;
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = oldList[oldItemPosition];
        val newEmployee = newList[newItemPosition];

        return oldEmployee == newEmployee;
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return if (oldList[oldItemPosition].isFavourite != newList[newItemPosition].isFavourite) true else null
    }
}