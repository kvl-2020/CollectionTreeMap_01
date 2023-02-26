package src;

public class Person {
    protected String name;
    protected String surname;
    protected int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    // создайте геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // создайте toString
    public String toString() {
        return name + " " + surname + ", " + age + " лет";
    }
}