package ruelas.barboza.com.example.app

import androidx.annotation.StringRes

data class Question (@StringRes val textResId: Int, val answer: Boolean, var enabled: Int)