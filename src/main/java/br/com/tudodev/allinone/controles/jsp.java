package br.com.tudodev.allinone.controles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/jsp")
public class jsp {

	@GetMapping()
	public ModelAndView paginaThymeleaf() {
		ModelAndView modelAndView = new ModelAndView("jsp");
		modelAndView.addObject("mensagemInicial", "JSP page");
		return modelAndView;
	}

}
