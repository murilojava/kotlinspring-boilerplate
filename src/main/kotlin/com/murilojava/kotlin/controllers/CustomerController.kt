package com.murilojava.kotlin.controllers

import com.murilojava.kotlin.dtos.CustomerUpdateDto

import com.murilojava.kotlin.documents.Customer
import com.murilojava.kotlin.repositories.CustomerRepository

import org.springframework.web.bind.annotation.*

@RestController
class CustomerController(val customerRepository: CustomerRepository) {


    @GetMapping("/customers")
    fun index() = customerRepository.findAll()

    @GetMapping("/customers/{id}")
    fun show(@PathVariable id: String) = customerRepository.findById(id)

    @PostMapping("/customers")
    fun show(@RequestBody customer: Customer) = customerRepository.save(customer)

    @PutMapping("/customers/{id}")
    fun show(@PathVariable id: String, @RequestBody customer: CustomerUpdateDto): Customer{
       
        val customerDB = customerRepository.findById(id)
            .orElseThrow { RuntimeException("Customer not found with id: $id") }
        
        customerDB.name = customer.name ?: customerDB.name
        customerDB.socialId = customer.socialId ?: customerDB.socialId
        customerDB.email = customer.email ?: customerDB.email
        customerDB.age = customer.age ?: customerDB.age

        return customerRepository.save(customerDB)
    }

}