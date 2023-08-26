package com.funch.shac.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.funch.shac.base.BaseViewModel
import com.funch.shac.data.repository.UserRepository
import com.funch.shac.presentation.utils.CoroutineContextProvider
import com.funch.shac.presentation.utils.ExceptionHandler
import kotlinx.coroutines.CoroutineExceptionHandler
import javax.inject.Inject
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class HomeViewModel @Inject constructor(
    contextProvider: CoroutineContextProvider,
    // private val userRepository: UserRepository // -> Module에 @provide로 impl return 하는 함수 있어야함
) : BaseViewModel(contextProvider) {
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    override val coroutineExceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
        val message = ExceptionHandler.parse(exception)
        // _character.postValue(CharacterDetailUIModel.Error(exception.message ?: "Error"))
    }


}