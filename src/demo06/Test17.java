package demo06;

interface IMath{
    int add(int a,int b);
}
public class Test17 {
    public static void main(String[] args) {
        IMath math = Integer::sum;
        System.out.println(math.add(20,30));
    }

    public void sum (int a, int b){

    }
}
