package ru.geekbrains

import io.reactivex.rxjava3.core.Observable


fun main() {
    val list = listOf(
        GitHubUser("1",1),
        GitHubUser("2",2),
        GitHubUser("3",3)
    )

    Observable.fromIterable(list)
        .distinct()
        .filter { it.login == "1" }
        .subscribe { println(it) }

}


data class GitHubUser(
    val login: String,
    val id: Int
)
