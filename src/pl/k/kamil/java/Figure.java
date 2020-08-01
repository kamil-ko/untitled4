package pl.k.kamil.java;

public abstract class Figure {

    private String name;


    public Figure(String name) {
        this.name = name;
    }

    public abstract int getField ();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
