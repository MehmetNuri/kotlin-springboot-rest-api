package com.mehmetnuri.kotlinspringbootrestapi.repository

import com.mehmetnuri.kotlinspringbootrestapi.domain.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository: JpaRepository<Category, Long> {
}