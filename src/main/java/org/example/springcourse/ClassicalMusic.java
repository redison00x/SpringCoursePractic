package org.example.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing initial");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destroy");
    }




    List<String> classicalList = new ArrayList<>();

    {
        classicalList.add("первая классическая песня");
        classicalList.add("вторая классическая песня");
        classicalList.add("третья классическая песня");
    }

    @Override
    public List<String> getSongs() {
        return classicalList;
    }
}