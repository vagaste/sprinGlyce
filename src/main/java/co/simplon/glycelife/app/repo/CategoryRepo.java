package co.simplon.glycelife.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.glycelife.app.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

	// public List<Category> findAll();

	// public Optional<Category> findAllById(Long id);

}
