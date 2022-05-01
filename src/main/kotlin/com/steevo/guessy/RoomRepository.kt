package com.steevo.guessy

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

interface RoomRepository : CrudRepository<Room, String>{
    @Query("select * from rooms")
    fun findRooms(): List<Room>
}


@Table("rooms")
data class Room(@Id val id: Int?, val guid: String)