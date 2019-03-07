package io.dkozak.gofycz.repository

import io.dkozak.gofycz.entity.GofyczTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface GofyczTaskRepository : JpaRepository<GofyczTask, Long> {
    @Query("select * from gofycz_task order by random() limit 1", nativeQuery = true)
    fun random(): GofyczTask?

}