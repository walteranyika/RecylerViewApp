package com.walter.recyclerviewapp;

/**
 * Created by waltersanchez on 11/28/16.
 */
public class Person {
    private String name,age;
    private int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPhotoId() {
        return photoId;
    }


}
