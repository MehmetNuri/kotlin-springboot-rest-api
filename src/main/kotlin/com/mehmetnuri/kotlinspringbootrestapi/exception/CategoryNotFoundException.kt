package com.mehmetnuri.kotlinspringbootrestapi.exception

import org.springframework.http.HttpStatus

class CategoryNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()