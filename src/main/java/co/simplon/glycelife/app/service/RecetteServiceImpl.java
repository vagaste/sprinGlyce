package co.simplon.glycelife.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Recette;
import co.simplon.glycelife.app.repo.RecetteRepo;

@Service
public class RecetteServiceImpl implements RecetteService {

	private RecetteRepo r7Repo;

	public RecetteServiceImpl(RecetteRepo r7Repo) {
		this.r7Repo = r7Repo;
	}

	@Override
	public List<Recette> getAll() {
		return r7Repo.findAll();
	}

	@Override
	public Recette saveRecette(Recette recette) {
		return r7Repo.save(recette);
	}

}
