package com.nicolas.navigation

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
data class Details(
    val id : String,
    val name : String
)