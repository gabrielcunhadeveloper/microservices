package dev.gabrielcunha.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gabrielcunha.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
