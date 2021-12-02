package builder;

public interface BuilderTest {

    public static void main(String[] args) {
        System.out.println(new SomeClass.Builder(100, 500).makeC(100).build());
        System.out.println(new SomeClass.Builder(200, 300).makeE(100).makeF(100000).build());

        SomeClass someClass=new SomeClass.Builder(100, 500).makeC(100).makeE(100).makeF(100).build();

        //тут так уже не получится
        //SomeClass someClass = new SomeClass(new SomeClass.Builder(2, 3));
    }

}
