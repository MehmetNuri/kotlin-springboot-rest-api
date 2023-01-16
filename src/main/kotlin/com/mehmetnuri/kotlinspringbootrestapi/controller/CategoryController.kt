package com.mehmetnuri.kotlinspringbootrestapi.controller

import com.mehmetnuri.kotlinspringbootrestapi.domain.Category
import com.mehmetnuri.kotlinspringbootrestapi.service.CategoryService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryController(private val categoryService: CategoryService) {

    @GetMapping("/categories")
    fun getAllCategories(): List<Category> = categoryService.getAllCategories()


    @GetMapping("/categories/{id}")
    fun getCategoryById(@PathVariable("id") id: Long): Category = categoryService.getCategoryById(id)

    @PostMapping("/categories")
    fun createCategory(@RequestBody payload: Category): Category = categoryService.createCategory(payload)

    @PutMapping("/categories/{id}")
    fun updateCategoryById(@PathVariable("id") id: Long, @RequestBody payload: Category): Category = categoryService.updateCategoryById(id, payload)

    @DeleteMapping("/categories/{id}")
    fun deleteCategoryById(@PathVariable("id") id: Long) = categoryService.deleteCategoryById(id)




}