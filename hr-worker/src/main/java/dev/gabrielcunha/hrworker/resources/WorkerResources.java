package dev.gabrielcunha.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gabrielcunha.hrworker.entities.Worker;
import dev.gabrielcunha.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResources {

	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> workers = repository.findAll();
		return ResponseEntity.ok().body(workers);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Worker> findById(@PathVariable("id") Long id) {
		Worker worker = repository.findById(id).get();
		return ResponseEntity.ok().body(worker);
	}
	
}
