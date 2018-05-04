package com.example.ultrasonic.service

import com.example.ultrasonic.domain.Ultra
import com.example.ultrasonic.repository.UltraRepository
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import java.time.LocalDate

@ContextConfiguration(classes = [UltraService::class])
class UltraServiceTest {

    @Autowired
    lateinit var ultraService: UltraService

    @Mock
    lateinit var UltraRepository: UltraRepository

    lateinit var sampleUltra: Ultra

    lateinit var sampleUltraJsonString: String

    private val mapper = jacksonObjectMapper()

    @Before
    fun setUp() {
        sampleUltra = Ultra(1,
                "latest sample Ultra")

        sampleUltraJsonString = mapper.writeValueAsString(sampleUltra)
    }

    @Test
    fun `get all Ultra`() {

        Mockito.doReturn(listOf(sampleUltra)).`when`(ultraService).all()

        ultraService.all()

        Mockito.verify(UltraRepository).findAll()
    }
}
