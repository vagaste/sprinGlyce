package co.simplon.glycelife.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.model.Category;

@Service

public interface CategoryService {

	public List<Category> getAll();

	public Optional<Category> getById(Long id);

}
