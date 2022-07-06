package br.com.tudodev.allinone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConfigJSPResolver {

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		// viewResolver.setViewClass(JstlView.class);

		// viewResolver.setPrefix("/WEB-INF/jsp/");
		// viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setContentType("text/html");

		// recursos.addResourceHandler("/recursos/**").addResourceLocations("/recursos/");

		// É NECESSÁRIO TER CUIDADO COM A ORDEM DE EXECUÇÃO DOS RESOLVERS!!!
		// Eles têm que ser executados, NECESSARIAMENTE, nessa ordem:
		// 0 - THYMELEAF;
		// 1 - FREEMARKER;
		// 2 - JSP.
		viewResolver.setOrder(1000);

		return viewResolver;
	}

	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry.addResourceHandler("/recursos/**").addResourceLocations("/recursos/");
	// }

}

//@Bean
//public ViewResolver internalResourceViewResolver() {
//    InternalResourceViewResolver bean = new InternalResourceViewResolver();
//    bean.setOrder(2);
//    bean.setViewClass(JstlView.class);
//    bean.setPrefix("/WEB-INF/jsp");
//    bean.setViewNames(new String[] {"*.jsp"});
//    bean.setSuffix("");
//    
//    return bean;
//}
