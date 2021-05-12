package demo06;

public class Demo01 {
    @FunctionalInterface //表明函数式编程
    interface IMymessage3{
        void print();
    }
    public static class Test16 {
        public static void main(String[] args) {
            IMymessage3 mymessage3 =()-> System.out.println("MyMessge");
            mymessage3.print();
        }
    }
}
