package builder;

//вариант обхода комбинаторики в конструкторе посредством подхода Javabeans
public class SomeClassJB {

        // обязательные поля, нет дефолтных значений
        private int a;
        private int b;

        // необязательные поля
        private int c = 0;

        public SomeClassJB() {
        }

        public void setA(int val) {
            a = val;
        }

        public void setB(int val) {
            b = val;
        }

        public void setC(int val) {
            c = val;
        }

}
//минусы - проблемы с объектом, как минимум необходимо чтобы он был в отличие от
//инициализации в конструкторе, где всё под контролем автоматически
