package com.test.unittesting_kotlinandroid

object RegistrationUtil {

    private val existingUsers = listOf("Das","Shekhar")

    /**
     * the input is not valid if......
     * .... the user name is not valid
     * .....the password is not valid
     * .......the confirmedPassword is not vali
     **/

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password !=  confirmedPassword){
            return false
        }
        if (password.count{it.isDigit()} < 2){
            return false
        }
        return true
    }
}