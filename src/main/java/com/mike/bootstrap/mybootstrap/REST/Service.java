package com.mike.bootstrap.mybootstrap.REST;
import com.mike.bootstrap.mybootstrap.MODEL.Topic;

@org.springframework.stereotype.Service
public class Service {

    public String say() {
        Topic test = new Topic("1", "mike", "read");
        String myObj = test.toString();
        System.out.println(myObj);
        return myObj;

    }
}
