package co.simplon.glycelife.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Category;

@Service
public interface CategoryService {

	public List<Category> getAll();

	public Optional<Category> getById(Long id);

}
