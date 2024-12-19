package org.example.springcourse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
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