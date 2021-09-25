package com.problem.service;

import java.util.Optional;

import com.problem.exceptions.RecordNotFoundException;
import com.problem.model.Model;
import com.problem.repository.impl.SampleRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SampleService {

	private final SampleRepo repository = new SampleRepo();

	public Model getModel(Integer id) {
		Optional<Model> model = this.repository.get(id);
		if (!model.isPresent()) {
			throw new RecordNotFoundException();
		}
		return model.get();
	}
	
}
