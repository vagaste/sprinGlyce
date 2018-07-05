package co.simplon.glycelife.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Aliment;

@Service
public interface AlimentService {

	public List<Aliment> getAll();

	public List<Aliment> getByName(String name);

	public List<Aliment> getByCategoryId(Long id);

	public List<Aliment> getByEnergyRange(int energyMin, int energyMax);

	public List<Aliment> getByIg(int igMin, int igMax);
}
