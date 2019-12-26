package class_OOP;

public class tets {
    
        public int rong, dai;

        public tets(int rong, int dai) {
            this.rong = rong;
            this.dai = dai;
        }
    }

    class MyClass {
        void method(tets x) {
            x.rong = 5;
            x.dai = 5;
        }

        public static void main(String[] args) {
            MyClass o = new MyClass();
            tets cn = new tets(1, 1);
            o.method(cn);
            System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
        }
    }

