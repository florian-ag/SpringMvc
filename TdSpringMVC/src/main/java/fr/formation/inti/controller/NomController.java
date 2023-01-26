package fr.formation.inti.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.inti.model.Nom;

@Controller
public class NomController {
	
	@Autowired
	@Qualifier("validator") //nom du validator
	private Validator validator;
	
	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	
	public NomController() {
		// TODO Auto-generated constructor stub
	}
	
	@ModelAttribute("nom")
	public Nom createEmpleeModel() {
		return new Nom();
	}

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/nompersonne", method = RequestMethod.GET)
	public ModelAndView showForm(Locale locale) {
		
		return new ModelAndView("formulaire", "nom", new Nom()); //2 objet instancié et 1 nom de la page ou c'est rempli
		
	}

	@RequestMapping(value = "/nompersonne", method = RequestMethod.POST)
	public String submit(@ModelAttribute("nom") @Validated Nom nom, BindingResult br,
			ModelMap model) {
		if (br.hasErrors()) {
			return "formulaire";
		}
		model.addAttribute("message", "Bonjour " + nom.getNom()+" "+ nom.getPrenom());
		model.addAttribute("valeur", "is " +nom.getNom()+" "+ nom.getPrenom()+ " cool? "+nom.isB());
//		model.addAttribute("contactNumber", employee.getContactNumber());
//		model.addAttribute("id", employee.getId());
//		model.addAttribute("isBG", employee.isBG());
		
		
		return "helloworld";
	}
	
}
