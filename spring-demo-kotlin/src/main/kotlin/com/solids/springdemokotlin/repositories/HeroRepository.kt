package com.solids.springdemokotlin.repositories

import com.solids.springdemokotlin.enitites.Hero
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface HeroRepository: PagingAndSortingRepository<Hero, UUID>