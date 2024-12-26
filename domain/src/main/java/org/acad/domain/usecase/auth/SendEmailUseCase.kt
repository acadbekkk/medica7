package org.acad.domain.usecase.auth

import org.acad.domain.repo.AuthRepo

/**
 * Created by Acad Bek on 12/26/2024
 */
class SendEmailUseCase constructor(
    private val authRepo: AuthRepo
) {
    operator fun invoke(email: String) { authRepo.sendEmailCode(email) }
}