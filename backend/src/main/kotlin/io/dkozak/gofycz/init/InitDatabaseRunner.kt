package io.dkozak.gofycz.init

import io.dkozak.gofycz.repository.GofyczTaskRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.support.TransactionTemplate

@Component
class InitDatabaseRunner(private val taskRepository: GofyczTaskRepository, private val transactionManager: PlatformTransactionManager) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        TransactionTemplate(transactionManager).execute {
            if (taskRepository.findAll().isEmpty()) {
                taskRepository.saveAll(initTasks)
            }
        }
    }
}