package com.problem.repository;

import java.util.Optional;

public interface BaseRepo<Key, Type> {
	public void create(Type t);

	public Type updata(Type t);

	public Optional<Type> get(Key id);

}
