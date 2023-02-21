package src

object Logger {

    fun i(message: String){
        println("Log Info : $message")
    }

    fun e(errorMessage: String){
        println("Log Error : $errorMessage")
    }
}