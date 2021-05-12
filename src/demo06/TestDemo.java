package demo06;

public class TestDemo {
    @FunctionalInterface
    interface IMessage{
        public void print();
    }
    public static class TestDemo1{
        public static void main(String[] args) {
            IMessage message = () -> {
                System.out.println("hello");
                System.out.println("world");
                System.out.println("hello world");
            };
            message.print();
        }
    }
}
