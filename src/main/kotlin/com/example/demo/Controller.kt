package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.math.roundToInt

@RestController
class GreetingController {

    @GetMapping("/pets")
    fun getPet( @RequestParam(value = "petName", defaultValue = "Tom") petName: String): ResponseEntity<Pet> {
        val newCat = Pet(
                id = (1000 * Math.random()).roundToInt().toString(),
                name = petName,
                type = "Cat"
        )
        return ResponseEntity.status(HttpStatus.OK).body(newCat)
    }

}
