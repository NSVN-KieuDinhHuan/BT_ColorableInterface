package com.company;

public class ColorableTest {
    public static void main(String[] args) {
        Square square=new Square();
        Shape[]shapes=new Shape[3];
        shapes[0]=new Square(5);
        shapes[1]=new Rectangle(2,3);
        shapes[2]=new Circle(3);
        for (int i=0;i<shapes.length;i++){
            System.out.println(shapes[i]);
            if (shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor();
            };

        }

    }
}
