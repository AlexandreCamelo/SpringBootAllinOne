package br.com.tudodev.allinone.controles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/thymeleaf")
public class Thymeleaf {

	@GetMapping()
	public ModelAndView paginaThymeleaf() {
		ModelAndView modelAndView = new ModelAndView("th_thymeleaf");
		modelAndView.addObject("mensagemInicial", "Thymeleaf page");
		return modelAndView;
	}

}
