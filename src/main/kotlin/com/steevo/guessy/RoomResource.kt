package com.steevo.guessy

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/rooms")
class RoomResource(val service: RoomService) {
    @GetMapping
    fun index(): List<Room> = service.findRooms()

    @PostMapping
    fun post(@RequestBody message: Room) {
        service.post(message)
    }
}