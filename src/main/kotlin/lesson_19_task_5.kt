enum class Gender(val displayName: String) {
    MALE("Мужской"),
    FEMALE("Женский");

    companion object {
        fun takeGender(gender: String): Gender? {
            return Gender.entries.find { it.displayName.equals(gender, ignoreCase = true) }
        }
    }
}

class Person(val name: String, val gender: Gender)

fun main() {
    val listPerson = mutableListOf<Person>()

    while (listPerson.size < 5) {
        println("Введите имя")
        val userName = readln()
        if (userName == "") {
            println("Вы ничего не ввели,попробуйте еще раз")
            continue
        }
        println("Введите пол:мужской/женский")
        val userGender = readln()
        val gender = Gender.takeGender(userGender)
        if (gender != null) {
            listPerson.add(Person(name = userName, gender = gender))
        } else {
            println("Полл указан неверно")
            println("Попробуйте еще раз")
        }
    }
    println("Список людей:")
    listPerson.forEach {
        println("Имя ${it.name} пол ${it.gender.displayName}")
    }
}