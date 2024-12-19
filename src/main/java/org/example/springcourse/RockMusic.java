package org.example.springcourse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements  Music {
    List<String> rockList = new ArrayList<>();

    {
        rockList.add("первая рок песня");
        rockList.add("вторая рок песня");
        rockList.add("третья рок песня");
    }


    @Override
    public List<String> getSongs() {
        return rockList;
    }
}
