package co.simplon.glycelife.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.glycelife.app.model.Aliment;
import co.simplon.glycelife.app.service.AlimentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/aliment")
public class AlimentController {

	private AlimentService alimentService;

	public AlimentController(AlimentService alimentService) {
		this.alimentService = alimentService;
	}

	@GetMapping
	public List<Aliment> displayAll() {
		return alimentService.getAll();
	}

	// @RequestMapping(method = RequestMethod.GET)
	// @ResponseBody
	// public List<Aliment> displayMySearch(String name, Category category, int
	// nrjMin, int nrjMax, int igMin, int igMax) {
	// List<Aliment> integralList = new ArrayList<Aliment>();
	// return integralList;
	// }
}
