package com.meet.navigationappjc.sharedviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.meet.navigationappjc.models.User

/**
 * @author Coding Meet
 * Created 09-01-2024 at 03:18 pm
 */

class UserScreenViewModel : ViewModel() {
    var user = mutableStateOf(User())
        private set


    fun newUser(newUser: User){
        user.value = newUser
    }
}