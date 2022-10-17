//package com.namseox.mymusicproject.acitivity.ui.home
//
//import android.app.Application
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//
//class AddPlaylistViewModelFagtory(private val app:Application) : ViewModelProvider.Factory {
//
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if(modelClass.isAssignableFrom(AddPlaylistViewModel::class.java)){
//            return AddPlaylistViewModel(app) as T
//        }
//        throw IllegalAccessException("abc")
//    }
//}