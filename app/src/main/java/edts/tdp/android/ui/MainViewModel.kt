package edts.tdp.android.ui

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    private val _counter: MutableLiveData<Int> = MutableLiveData(0)
    val counter: LiveData<Int> = _counter
    fun setCounter(input: Int) {
        _counter.value = input
    }

    private var _score: Int = 0
    val score: Int = _score
    fun setScore(input: Int) {
        _score = input
    }

    val xFlow: Flow<Int> = flow {
        emit(1)
        delay(2000L)
        emit(2)
    }

    val xLiveData = xFlow.asLiveData()



}