# SpringBootAllinOne

Spring Boot project where you can use Thymeleaf, JSF and JSP at the same time.

Project built in Spring Boot, in which I demonstrate the use, WITHIN THE SAME PROJECT, the use of Thymeleaf, JSF/Primefaces and the old JSP, at the same time.

Although Spring recommends the use of Thymeleaf, due to its perfect integration with the framework, I prefer to work with JSF, using Primefaces, due to the productivity that these technologies provide.

As for the JSP, despite being a very old technology, I know that there are developers who still use it. So, why not use it, using the great benefits of spring?

As the objective here is not “to teach programming”, but to help other developers, I will not explain details, ok? I'll give you basic instructions, so you can get it all working.

The first secret is in the 'config' folder, where the 'resolvers' for each of the technologies are. These classes “teach” Spring how to resolve calls to each of the page types. Open each of the classes and try to understand them.

The second secret is in the DEPENDENCIES. The essential dependencies for the project to function are:
1) joinfaces (which integrates JSF seamlessly with Spring Boot);
2) Thymeleaf;
3) JSTL (without it, JSP pages don't load).

The third secret lies in the arrangement of the folders, where the pages are. In order for spring boot to find the JSF and JSP pages, it is necessary to make a different arrangement than usual. Watch everything and always keep the folder build current. If you change them, you may have problems.

<h3>a few instructions</h3>
1) Start the project (it will start on port 8080);
<br/>
2) The addresses for each of the pages are:
  <br/>
  a) localhost:8080/jsf.xhtml
  <br/>
  b) localhost:8080/th_thymeleaf
  <br/>
  c) localhost:8080/jsp
<br/>
3) After opening any of them, you can navigate between the pages by clicking on the corresponding links;
<br/>
4) <b>IMPORTANT:</b> To differentiate JSP pages from Thymeleaf pages, Thymeleaf pages must have the prefix th_. Example: th_names.html. If you don't name the pages like that, spring won't find the thymeleaf pages.
