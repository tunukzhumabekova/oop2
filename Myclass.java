public class Myclass {
    String name;
    String surname;
    int age;
    String[] Subjects;
    String favDish;

    public Myclass(String name, String surname, int age, String[] subjects) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.Subjects = subjects;

    }

    public Myclass(String name, String surname, int age, String[] subjects, String favDish) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.Subjects = subjects;
        this.favDish = favDish;
    }
}
