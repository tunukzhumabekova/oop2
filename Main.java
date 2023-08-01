import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String lessons[]={"Java","English","soft skills"};
        Myclass Myclass=new Myclass("Alina","Ahunova",21,lessons,"plov");
        Myclass myclass=new Myclass("Tunuk","Zhumabekova",16,lessons);
        System.out.println(Myclass.name);
        System.out.println(Myclass.surname);
        System.out.println(Myclass.age);
        System.out.println(Arrays.toString(Myclass.Subjects));
        System.out.println(Myclass.favDish);
        System.out.println("_________________________");
        System.out.println(myclass.name);
        System.out.println(myclass.surname);
        System.out.println(myclass.age);
        System.out.println(Arrays.toString(myclass.Subjects));
    }
}