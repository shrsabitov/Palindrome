package composite;

public interface Printable {
    public void print();

    public static void main(String[] args) {

        Node first = new Node("main");
        Node second = new Node("second");
        Node third = new Node("third");

        Leaf a = new Leaf("a");
        Leaf b = new Leaf("b");
        Leaf c = new Leaf("c");
        Leaf d = new Leaf("d");
        Leaf e = new Leaf("e");
        Leaf f = new Leaf("f");

        first.add(second);
        first.add(third);

        second.add(a);
        second.add(b);
        second.add(c);

        third.add(e);
        third.add(f);
        third.add(e);

        first.print();



    }

}
