package com.example.ultrasonic.repository

import com.example.ultrasonic.domain.Ultra
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UltraRepository : JpaRepository<Ultra, Long>