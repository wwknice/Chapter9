package demo06;

interface  IMyMessage6<R , P>{
    R compare( P canshu1 , P canshu2);
}
public class Test3{
    public static void main(String[] args) {
        IMyMessage6<Integer ,String > shili =String::compareTo;
        System.out.println(shili.compare("b ", "a"));
    }
}

