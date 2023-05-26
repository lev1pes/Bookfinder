package com.example.bookfinder.presentation.result

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bookfinder.data.model.BookInfo
import com.example.bookfinder.domain.GetBookUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ResultViewModel : ViewModel() {

    private val getBookUseCase = GetBookUseCase()
    val bookLiveData = MutableLiveData<BookInfo?>()

    fun getBook(bookName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            bookLiveData.postValue(getBookUseCase.execute(bookName))
        }
    }
}