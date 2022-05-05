package com.example.independencework.domain;

public class Model {
   public int image;
   public int image2;
    public String title;
    public String topic;
    public String context;
    public String context2;

    public Model(int image, int image2, String title, String topic, String context, String context2) {
        this.image = image;
        this.image2 = image2;
        this.title = title;
        this.topic = topic;
        this.context = context;
        this.context2 = context2;
    }
}
