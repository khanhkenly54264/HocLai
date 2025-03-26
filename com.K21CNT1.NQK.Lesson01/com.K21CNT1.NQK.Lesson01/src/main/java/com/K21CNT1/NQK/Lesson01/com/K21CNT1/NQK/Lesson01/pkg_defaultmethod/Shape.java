package com.K21CNT1.NQK.Lesson01.com.K21CNT1.NQK.Lesson01.pkg_defaultmethod;

public interface Shape {
    void draw();
    default void setColor(String color) {
        System.out.println("Vẽ hình với màu "+color);
    }
}