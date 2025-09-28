fun main() {

    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации:${smsCode}")
        print("Введите ваш код для авторизации:")
        val userCode = readln().toInt()
        if (smsCode==userCode){
            println("Приветсвую вас")
        }
    }while (smsCode!=userCode)
}