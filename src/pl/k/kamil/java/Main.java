package pl.k.kamil.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square square = new Square("Kwadrat", 5);
        System.out.println(square.getField());

        Rectangle rectangle  = new Rectangle("Prostokat", 5,6);
        System.out.println(rectangle.getField());

        Figure[] figures = {square,rectangle};

        for (Figure figure : figures) {
            System.out.println(figure.getField());
        }


    }


}
