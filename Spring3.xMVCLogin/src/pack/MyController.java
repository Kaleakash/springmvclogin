package pack;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String openForm(ModelMap model) {
		System.out.println("Form Open");
		Login ll = new Login();
		model.addAttribute("login", ll);
		return "login";
	}
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String processForm(@ModelAttribute("login") @Valid Login ll,BindingResult error) {
		System.out.println("Processing Form");
		if(error.hasErrors()){
		return "login";	
		}else {
		String name = ll.getName();
		String pass = ll.getPass();
		if(name.equals("Akash") && pass.equals("kale")){
			return "success";
		}else {
			return "failure";
		}
		}
	}
	
}
