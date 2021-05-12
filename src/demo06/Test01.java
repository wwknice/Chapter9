package demo06;
interface  ImyMessage<P , R>{
    R zhuanhuancanshu(P shili) ;
}
public class Test01 {
    public static void main(String[] args) {
        ImyMessage<Integer ,String> message = String::valueOf;
        String str = message.zhuanhuancanshu(1000);
        System.out.println(str.length());
    }
}
