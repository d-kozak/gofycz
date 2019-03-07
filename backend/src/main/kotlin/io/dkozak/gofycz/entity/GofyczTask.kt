package io.dkozak.gofycz.entity

import javax.persistence.*

@Entity
@Table(name = "gofycz_task")
class GofyczTask(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long = 0,
        var challenge: String = ""
) {
    override fun toString(): String = "Task($id,$challenge)"
}