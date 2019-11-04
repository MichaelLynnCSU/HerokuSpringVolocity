package com.mike.bootstrap.mybootstrap.REST;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.velocity.app.VelocityEngine;


import java.io.StringWriter;
import java.util.Properties;


@RestController
public class Controller {

        @Autowired
        private Service topService;

    VelocityEngine ve;
    Properties props;

    // get is default method
    @RequestMapping("/")
    public String sayHi(Model model){

        topService.say();
        ve = new VelocityEngine();
        String result = null;
        VelocityEngine velocity = new VelocityEngine();
        velocity.init();
        Template template = velocity.getTemplate("src/main/resources/public/templates/layout.vm");
        VelocityContext context = new VelocityContext();
        context.put("message", "Select Data");

        StringWriter writer = new StringWriter();
        template.merge(context, writer);
        result = writer.toString();
        return result;

    }

   //  get is default method
    @RequestMapping("/hello2")
    public String sayHi2(){
        return topService.say();
    }

}
