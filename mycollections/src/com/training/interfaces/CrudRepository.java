package com.training.interfaces;
import java.util.*;

public interface CrudRepository<T> {
	public boolean save(T entity);
	public List<T> findAll();
}
