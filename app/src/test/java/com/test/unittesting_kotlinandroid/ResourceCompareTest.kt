package com.test.unittesting_kotlinandroid

import android.content.Context
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ResourceCompareTest{
   private val resourceCompare = ResourceCompare()

    @Test
    fun fooTestWithPackageName(){

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context,R.string.app_name,"UnitTesting-Kotlin(Android)")
        assertThat(result).isTrue()
    }

    @Test
    fun fooTestWithPackageName_Wrong(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context,R.string.app_name,"UnitTesting")
        assertThat(result).isFalse()
    }

}