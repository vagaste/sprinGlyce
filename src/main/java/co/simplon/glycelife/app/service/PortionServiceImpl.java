package co.simplon.glycelife.app.service;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Portion;
import co.simplon.glycelife.app.repo.PortionRepo;

@Service
public class PortionServiceImpl implements PortionService {

	private PortionRepo portionRepo;

	public PortionServiceImpl(PortionRepo portionRepo) {
		this.portionRepo = portionRepo;
	}

	@Override
	public Portion savePortion(Portion portion) {
		return portionRepo.save(portion);
	}

}
