package com.mike.bootstrap.mybootstrap.MODEL;

public class Topic {

    public String id;
    public String name;
    public String desc;

    public Topic(String id, String name, String desc){
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    // print my object when using toSting
    @Override
    public String toString() {
        String myStr = id + " " + name + " " + desc;
        return myStr;
    }


}