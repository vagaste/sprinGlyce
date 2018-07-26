package co.simplon.glycelife.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Recette;

@Service
public interface RecetteService {

	public List<Recette> getAll();

	public Recette saveRecette(Recette recette);
	
	public void removeById(Long id);
	
}
