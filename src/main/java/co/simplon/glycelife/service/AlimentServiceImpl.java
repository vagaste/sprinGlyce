package co.simplon.glycelife.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.model.Aliment;
import co.simplon.glycelife.repo.AlimentRepo;

@Service
public class AlimentServiceImpl implements AlimentService {

	@Inject
	private AlimentRepo alimentRepo;

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
		return alimentRepo.findByEnergy(energyMin, energyMax);
	}

	@Override
	public List<Aliment> getByIg(int igMin, int igMax) {
		return alimentRepo.findByIg(igMin, igMax);
	}

}
