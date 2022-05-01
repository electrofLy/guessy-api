package com.steevo.guessy

import org.springframework.stereotype.Service

@Service
class RoomService(val db: RoomRepository) {
    fun findRooms(): List<Room> = db.findRooms()
    fun post(message: Room) {
        db.save(message)
    }
}