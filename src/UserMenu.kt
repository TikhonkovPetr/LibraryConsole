class UserMenu {
    fun mainMenu(): Int {
        println(
            "Выберите действие:" +
                    "\n1. Показать книги" +
                    "\n2. Показать газеты" +
                    "\n3. Показать диски" +
                    "\n4. Завершить работу"
        )
        return readln().toInt()
    }

    fun choiceListMenu(): Int {
        println("Выберите объект из списка по ID")
        return readln().toInt()
    }

    fun choiceActivityWithObject(): Int {
        println(
            "Выберите действие:" +
                    "\n1. Взять домой" +
                    "\n2. Читать в читальном зале" +
                    "\n3. Показать подробную информацию" +
                    "\n4. Вернуть" +
                    "\n5. вернуться на главную страницу"
        )
        return readln().toInt()
    }
}