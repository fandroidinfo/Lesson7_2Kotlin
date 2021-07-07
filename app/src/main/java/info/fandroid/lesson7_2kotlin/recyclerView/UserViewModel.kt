package info.fandroid.lesson7_2kotlin.recyclerView

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    var userList : MutableLiveData<List<User>> = MutableLiveData()

    //инициализируем список и заполняем его данными пользователей
    init {
        userList.value = UserData.getUsers()
    }

    fun getListUsers() = userList

    //для обновления списка получаем второй список пользователей
    fun updateListUsers() {
        userList.value = UserData.getAnotherUsers()
    }
}