package com.problem.controller;

import com.problem.model.Model;
import com.problem.service.SampleService;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class SampleController {
	private final SampleService _sampleService = new SampleService();

	public void createMethod(@NonNull final Integer id) {
		final Model model = _sampleService.getModel(id);
		System.out.println(model);
	}
}
