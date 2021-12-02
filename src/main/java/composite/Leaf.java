package composite;

import java.util.Locale;

public class Leaf implements Printable{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(getClass().getName().toLowerCase(Locale.ROOT)+" "+name);
    }
}
