package com.mehmetnuri.kotlinspringbootrestapi.service

import com.mehmetnuri.kotlinspringbootrestapi.domain.Category
import com.mehmetnuri.kotlinspringbootrestapi.exception.CategoryNotFoundException
import com.mehmetnuri.kotlinspringbootrestapi.repository.CategoryRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class CategoryService(private val categoryRepository: CategoryRepository) {


    fun getAllCategories(): List<Category> {
        return categoryRepository.findAll()
    }

    fun getCategoryById(id: Long): Category {
        return categoryRepository.findById(id).orElseThrow { CategoryNotFoundException(HttpStatus.NOT_FOUND, "Category not found") }
    }

    fun createCategory(category: Category): Category = categoryRepository.save(category)

    fun updateCategoryById(categoryId: Long, category: Category): Category {
       return  if (categoryRepository.existsById(categoryId)) {
            categoryRepository.save(Category(
                id = categoryId,
                name = category.name,
                subCategory = category.subCategory
            ))
        } else {
            throw CategoryNotFoundException(HttpStatus.NOT_FOUND, "Category not found")
        }
    }

    fun deleteCategoryById(categoryId: Long) {
        if (categoryRepository.existsById(categoryId)) {
            categoryRepository.deleteById(categoryId)
        } else {
            throw CategoryNotFoundException(HttpStatus.NOT_FOUND, "Category not found")
        }
    }
}