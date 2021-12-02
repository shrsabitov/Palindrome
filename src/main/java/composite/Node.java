package composite;

import java.util.ArrayList;
import java.util.List;

public class Node implements Printable {
    private List<Printable> children = new ArrayList<>();
    private String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        for (Printable p : children
        ) {
            p.print();
        }
    }

    public void add(Printable child) {
        if (!children.contains(child))
            children.add(child);
    }

    public void remove(Printable child) {
        children.remove(child);
    }

}
