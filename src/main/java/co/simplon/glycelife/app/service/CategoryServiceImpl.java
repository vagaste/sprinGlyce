package co.simplon.glycelife.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Category;
import co.simplon.glycelife.app.repo.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepo catRepo;

	public CategoryServiceImpl(CategoryRepo catRepo) {
		this.catRepo = catRepo;
	}

	@Override
	public List<Category> getAll() {
		return catRepo.findAll();
	}

	@Override
	public Optional<Category> getById(Long id) {
		return catRepo.findById(id);
	}

}
