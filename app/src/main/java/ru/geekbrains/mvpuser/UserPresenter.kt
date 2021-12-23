package ru.geekbrains.mvpuser

import moxy.MvpPresenter
import ru.geekbrains.data.GitHubUserRepository
import ru.geekbrains.navigation.CustomRouter

class UserPresenter(
    private val userLogin: String,
//    private val userRepository: GitHubUserRepository,
//    private val router: CustomRouter
) : MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
//        userRepository
//            .getUserByLogin(userLogin)
//            ?.let(viewState::showUser)
    }
}