package com.problem.repository.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.problem.model.Model;
import com.problem.repository.BaseRepo;

public class SampleRepo implements BaseRepo<Integer,Model> {

	private Map<Integer, Model> storage = new HashMap<Integer, Model>();

	public void create(Model t) {
		this.storage.put(1, t);
	}

	public Model updata(Model t) {
		return null;
	}

	public Optional<Model> get(Integer id) {
		return Optional.of(this.storage.get(id));
	}

}
