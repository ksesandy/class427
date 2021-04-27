package com.tom;

public class Box {
    String name;
    int price;
    int length;
    int width;
    int height;

    public boolean validate(int a,int b,int c){
        return (a <= length && b <= width && c<= height);
    }
}
