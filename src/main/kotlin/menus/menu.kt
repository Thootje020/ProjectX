

fun menu(username: String) {
    println("Welcome, " + username)

    println("Start game")

    if (saves != 0) {
        println("Load game 2")
    } else { }

    println("Options" + "\n" + "Exit game")
    if (readLine() == "Options") {
        showOptions(username)
    } else { }

    if (readLine() == "Start") {
        loadScreenToGame(username)
    } else {
        println("DEBUG")
    }
}
