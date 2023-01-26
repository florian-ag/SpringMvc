package fr.formation.inti.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import fr.formation.inti.model.Nom;

@Component
public class Validator implements org.springframework.validation.Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Nom.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");

//		Nom emp = (Nom) target;
//		if (emp.getId() <= 0) {
//			errors.rejectValue("id", "negativeValue", new Object[] { "'id'" }, "id can't be negative");
//		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nom", "nom.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prenom", "prenom.required");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "contactNumber.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "B", "B.required");
		
	}

}
