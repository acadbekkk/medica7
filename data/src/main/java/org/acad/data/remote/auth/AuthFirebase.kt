package org.acad.data.remote.auth

/**
 * Created by Acad Bek on 12/19/2024
 */
interface AuthFirebase {
    fun sendEmailCode(email: String)
}