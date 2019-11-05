package heroku_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;
import java.util.Properties;

@RestController
public class HomeController {


	// get is default method
	@RequestMapping("/")
	public String sayHi(){
        String result = null;
        VelocityEngine velocity = new VelocityEngine();
        Properties p = new Properties();
        p.setProperty("resource.loader", "class");
        p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        velocity.init(p);
        Template template = velocity.getTemplate("templates/layout.vm");
        VelocityContext context = new VelocityContext();
        context.put("message", "Select Data");

        StringWriter writer = new StringWriter();
        template.merge(context, writer);
        result = writer.toString();
        return result;

    }

}
