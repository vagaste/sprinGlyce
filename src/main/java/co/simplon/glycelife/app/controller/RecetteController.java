package co.simplon.glycelife.app.controller;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.glycelife.app.model.Portion;
import co.simplon.glycelife.app.model.Recette;
import co.simplon.glycelife.app.service.PortionServiceImpl;
import co.simplon.glycelife.app.service.RecetteServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/recettes")
public class RecetteController {

	private RecetteServiceImpl recetteService;
	private PortionServiceImpl portionService;

	public RecetteController(RecetteServiceImpl recetteService, PortionServiceImpl portionService) {
		this.recetteService = recetteService;
		this.portionService = portionService;
	}

	// affichage de la liste des recettes
	@GetMapping
	public List<Recette> displayAll() {
		return recetteService.getAll();
	}

	// creation d une recette à sauvegarder en DB
	@RequestMapping("/save")
	@PostMapping
	@Transactional
	// public String create(@ModelAttribute Recette recette) {
	public Recette create(@RequestBody Recette recette) {
		try {
			recetteService.saveRecette(recette);
			System.out.println(recette.getId());
			for (Portion portion : recette.getPortions()) {
				portion.setRecette(recette);
				portionService.savePortion(portion);
			}
			return recette;
		} catch (Exception e) {
			return null;
		}
	}
	
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
		public void delete(@PathVariable("id") Long id) {
		try{
			recetteService.removeById(id);	
			//return "La recette " + id + " est supprimée !";
	} catch (Exception e){
		System.out.println(e);
		
	}	
		
	}
}
