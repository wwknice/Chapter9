package demo06;

import java.util.Locale;

interface  IMyMessage2<R>{
    R zhuanchengdaxie();
}
public class Test02 {
    public static void main(String[] args) {
        // "hello":: toUpperCase;
        IMyMessage2<String> shili = "hello"::toUpperCase;
        System.out.println(shili.zhuanchengdaxie());
    }
}
