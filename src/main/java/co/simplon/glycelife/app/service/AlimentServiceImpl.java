package co.simplon.glycelife.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Aliment;
import co.simplon.glycelife.app.repo.AlimentRepo;

@Service
public class AlimentServiceImpl implements AlimentService {

	private AlimentRepo alimentRepo;

	public AlimentServiceImpl(AlimentRepo alimentRepo) {
		this.alimentRepo = alimentRepo;
	}

	@Override
	public List<Aliment> getAll() {
		return alimentRepo.findAll();
	}

	@Override
	public List<Aliment> getByName(String name) {
		return alimentRepo.findByName(name);
	}

	@Override
	public List<Aliment> getByCategoryId(Long id) {
		return alimentRepo.findByCategoryId(id);
	}

	@Override
	public List<Aliment> getByEnergyRange(int energyMin, int energyMax) {
		return alimentRepo.findByEnergyBetween(energyMin, energyMax);
	}

	@Override
	public List<Aliment> getByIg(int igMin, int igMax) {
		return alimentRepo.findByIgBetween(igMin, igMax);
	}

}
