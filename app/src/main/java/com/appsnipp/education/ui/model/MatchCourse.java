/*
 * Copyright (c) 2020. rogergcc
 */

package com.appsnipp.education.ui.model;


public class MatchCourse {

    private final int id;
    private final String name;
    private final String numberOfCourses;
    private final int imageResource;
    private final int imageResource2;

    public MatchCourse(int id, String name, String numberOfCourses, int imageResource, int imageResource2) {
        this.id = id;
        this.name = name;
        this.numberOfCourses = numberOfCourses;
        this.imageResource = imageResource;
        this.imageResource2 = imageResource2;
    }

    @Override
    public String toString() {
        return "MatchCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfCourses='" + numberOfCourses + '\'' +
                ", imageResource=" + imageResource +
                '}';
    }

    public int getImageResource2() {
        return imageResource2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumberOfCourses() {
        return numberOfCourses;
    }

    public int getImageResource() {
        return imageResource;
    }
}
