package co.simplon.glycelife.app.controller;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String create(@ModelAttribute Recette recette) {
		try {
			recetteService.saveRecette(recette);
			for (Portion portion : recette.getPortions()) {
				portionService.savePortion(portion);
			}
			return "La recette " + recette.getName() + ", id= " + recette.getId() + "a bien été enregistrée.";
		} catch (Exception e) {
			return "Nous n'avons pas pu enregistrer cette recette :-(." + e;
		}
	}

}
