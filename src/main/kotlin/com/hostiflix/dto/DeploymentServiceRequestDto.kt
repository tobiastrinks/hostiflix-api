package com.hostiflix.dto

data class DeploymentServiceRequestDto (
    val startCode : String,
    val buildCode : String,
    val token : String,
    val gitRepo : String,
    val subDomain : String
)