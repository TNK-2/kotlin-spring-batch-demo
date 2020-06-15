package com.example.batchprocessing;

data class Person (
    val lastName: String,
    val firstName: String
){
    override fun toString(): String {
        return "firstName: $firstName, lastName: $lastName";
    }
}