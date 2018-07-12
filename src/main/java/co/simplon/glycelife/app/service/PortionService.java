package co.simplon.glycelife.app.service;

import org.springframework.stereotype.Service;

import co.simplon.glycelife.app.model.Portion;

@Service
public interface PortionService {

	public Portion savePortion(Portion portion);
}
