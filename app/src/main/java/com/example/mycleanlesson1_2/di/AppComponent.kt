package com.example.mycleanlesson1_2.di

import com.example.mycleanlesson1_2.MainActivity
import dagger.Component

@Component
interface AppComponent {
    fun inject(activity: MainActivity)
}