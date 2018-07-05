package co.simplon.glycelife.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.simplon.glycelife.model.Aliment;
import co.simplon.glycelife.service.AlimentService;

@Controller
@RequestMapping("/aliment")
public class AlimentController {

	@Inject
	private AlimentService alimentService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
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
