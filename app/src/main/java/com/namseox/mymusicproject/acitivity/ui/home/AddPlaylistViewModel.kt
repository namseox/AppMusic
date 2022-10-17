//package com.namseox.mymusicproject.acitivity.ui.home
//
//import android.app.Application
//import android.util.Log
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
////import com.namseox.mymusicproject.dao.AppDatabase
//import com.namseox.mymusicproject.model.Playlist
//import com.namseox.mymusicproject.reponstory.PlaylistReponstory
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//class AddPlaylistViewModel(private val app: Application): ViewModel()  {
//
////    private val studentResponsitory =PlaylistReponstory(
////        AppDatabase.getInstance(app.applicationContext,viewModelScope).getPlayListDao()
////    )
//    fun insertAddPlaylist(playlist: Playlist){
//        viewModelScope.launch(Dispatchers.IO) {
//            studentResponsitory.insertSudent(playlist)
//        }
//    }
//}