package com.example.ultrasonic.service

import com.example.ultrasonic.domain.Ultra
import com.example.ultrasonic.repository.UltraRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UltraService {

    @Autowired
    private lateinit var UltraRepository: UltraRepository

    fun publish(Ultra: Ultra): Ultra =
            UltraRepository.save(Ultra)

    fun all(): List<Ultra> =
            UltraRepository.findAll()
}
