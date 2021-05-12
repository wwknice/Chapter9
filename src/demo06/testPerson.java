package demo06;


@FunctionalInterface
interface IMyPerson<R , PN , PA>{
    public R message( PN name , PA age);
}
public class testPerson {
    public static void main(String[] args) {
        //. Person::new 引用构造方法
        IMyPerson<Person ,String , Integer> shili = Person::new;
        System.out.println(shili.message("eloMask", 45));

    }
}
