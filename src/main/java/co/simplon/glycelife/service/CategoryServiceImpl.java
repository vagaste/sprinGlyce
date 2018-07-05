package co.simplon.glycelife.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.model.Category;
import co.simplon.glycelife.repo.CategoryRepo;

@Service

public class CategoryServiceImpl implements CategoryService {

	@Inject
	private CategoryRepo catRepo;

	
	@Override
	public List<Category> getAll() {
		return catRepo.findAll();
	}
	
	@Override
	public Optional<Category> getById(Long id) {
		return catRepo.findById(id);
	}

}
