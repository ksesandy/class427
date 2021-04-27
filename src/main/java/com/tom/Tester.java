package com.tom;

public class Tester {
    public static void main(String[] args) {

        Box[] boxes = {
                new Box1(),
                new Box2(),
                new Box3(),
                new Box4(),
                new Box5()
        };

        int length = 58;
        int width = 7;
        int height = 6;

        for(Box box :boxes){
            if(box.validate(length,width,height)){
                System.out.println(box.name + " it is ! $:" + box.price );
                break;
            }else{
                System.out.println("There is no box!");
                break;
            }


        }
    }
}
