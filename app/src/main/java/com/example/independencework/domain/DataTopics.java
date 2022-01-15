package com.example.independencework.domain;

import java.util.ArrayList;
import java.util.List;

public class DataTopics {

    public static List<Model> getList() {

        List<Model> topics = new ArrayList<>();

        int a = topics.size();

        topics.add(new Model(a+=1,
                " Humor and satire in W. Shakespeare’s comedies.")
        );
        topics.add(new Model(a+=1,
                " The reflection of heroism in the novels of E.Hemingway.")
        );
        topics.add(new Model(a+=1,
                " Enlighteners’ philosophy and its reflection in English literature.")
        );
        topics.add(new Model(a+=1,
                " Problems of childhood and education in Ch.Dickens’ works.")
        );


        return topics;
    }

}
