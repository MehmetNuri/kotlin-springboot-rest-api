package com.mehmetnuri.kotlinspringbootrestapi.domain

import javax.persistence.*

@Entity
data class Category(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "NAME")
    val name: String,

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Category::class)
    @JoinColumn(name = "ID_PARENT")
    val subCategory: Category? = null
)

