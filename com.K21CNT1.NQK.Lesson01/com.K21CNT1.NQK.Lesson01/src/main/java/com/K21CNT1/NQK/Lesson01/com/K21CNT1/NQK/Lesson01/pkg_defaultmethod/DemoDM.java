package com.K21CNT1.NQK.Lesson01.com.K21CNT1.NQK.Lesson01.pkg_defaultmethod;

public class DemoDM implements Shape {
    @Override
    public void draw() {
        System.out.println("DemoDM.draw");
    }

    public static void main(String[] args) {
        DemoDM dm = new DemoDM();
        dm.draw();
        dm.setColor("Red");
    }
}