package com.solids.springdemokotlin.enitites

import com.solids.springdemokotlin.utils.ZERO_UUID
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.hibernate.annotations.UuidGenerator
import java.time.Instant
import java.util.*

@Entity
class Hero(
    @Id
    @UuidGenerator
    var id: UUID = ZERO_UUID,
    var nickname: String,
    var experience: Long = 0,
    @CreationTimestamp
    var createdAt: Instant = Instant.MIN,
    @UpdateTimestamp
    var updatedAt: Instant = Instant.MIN
)
