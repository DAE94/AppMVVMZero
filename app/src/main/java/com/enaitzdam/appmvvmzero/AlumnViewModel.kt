package com.enaitzdam.appmvvmzero

import androidx.lifecycle.ViewModel

class AlumnViewModel : ViewModel() {

    private var _alumnNumber = 0
    val alumnNumber: Int
        get()= _alumnNumber



    fun countAlumns (age: Int) {
        val alumnList: List<AlumnModel> = AlumnProvider.getList()

        _alumnNumber = alumnList.count {it.age == age}

    }

}