package builder;

//внутренний статический класс
public class SomeClass {

    //обязательные поля
    public final int a;
    public final int b;
    //необязательные поля
    private int c;
    private int d;
    private int e;
    private int f;

    //конструктор стал приватным -> значит может вызываться только из самого класса
    private SomeClass(Builder builder) {
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
        e = builder.e;
        f = builder.f;
    }

    //вместо конструктора внутренний статкласс, по сути статическая фабрика
    //хотя и статический, но вложенный, поэтому имеет доступ к конструктору
    public static class Builder {
        //поля "в которых уверены" можно задавать и обычным способом
        private final int a;
        private final int b;
        private int c =0; //есть дефолтная реализация
        private int d;
        private int e;
        private int f;

        public Builder(int a, int b) {
            this.a = a;
            this.b = b;
        }

        //методы похожи на сеттеры
        public Builder makeC(int c) {
            this.c = c;
            return this;
        }

        public Builder makeD(int d) {
            this.d = d;
            return this;
        }

        public Builder makeE(int e) {
            this.e = e;
            return this;
        }

        public Builder makeF(int f) {
            this.f = f;
            return this;
        }

        //вишенка на торте
        public SomeClass build() {
            return new SomeClass(this);
        }

    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        //Тут внутри такая форма возможна
        System.out.println(new SomeClass(new SomeClass.Builder(2, 3).makeC(5)));
    }

}

