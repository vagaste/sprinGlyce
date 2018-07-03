package co.simplon.glycelife.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.model.Aliment;

@Service
public interface AlimentService {

	public List<Aliment> getAll();
	
	public List<Aliment> findByName(String name);
	
	public List<Aliment> findByCategoryId(Long id );
	
	public List<Aliment> findByEnergy(double energy);
	
	public List<Aliment> findByIg(int ig);
}
