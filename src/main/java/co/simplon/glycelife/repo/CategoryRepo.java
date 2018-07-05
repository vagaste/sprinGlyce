package co.simplon.glycelife.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.glycelife.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

	public List<Category> findAll();

	public Optional<Category> findAllById();
	
}
