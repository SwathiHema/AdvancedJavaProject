package com.project.batacademy.model;
// Generated Aug 12, 2016 12:54:43 PM by Hibernate Tools 4.3.1

/**
 * Activity generated by hbm2java
 */
public class Activity implements java.io.Serializable {

    private ActivityId id;
    private int a1;
    private int a2;
    private int a3;

    public Activity() {
    }

    public Activity(ActivityId id, int a1, int a2, int a3) {
        this.id = id;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public ActivityId getId() {
        return this.id;
    }

    public void setId(ActivityId id) {
        this.id = id;
    }

    public int getA1() {
        return this.a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return this.a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getA3() {
        return this.a3;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

}