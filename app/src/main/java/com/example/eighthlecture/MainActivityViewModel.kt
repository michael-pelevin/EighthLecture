package com.example.eighthlecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val employees = MutableLiveData(Employee.getMockEmployees())

    fun addRandomEmployees(){
        employees.value = employees.value?.toMutableList()?.apply {
            add(Employee.getMockEmployees().random())
        }
    }

    fun deleteEmployees(position: Int){
        employees.value = employees.value?.toMutableList()?.apply {
            removeAt(position)
        }
    }

//    fun makeFafourite(position: Int){
//        val item = employees.value?.get(position)
//        if(item?.isFavourite == true){
//            item.isFavourite = false
//        }
//        else {
//                item?.isFavourite = true
//        }
//    }


}