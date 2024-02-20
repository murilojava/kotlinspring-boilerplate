package com.murilojava.kotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HealtzController {
    @GetMapping("/healtz")
    fun index() = "It is working!"
}