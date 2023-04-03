package lab2;


class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Мы не можем принимать еще не рожденых");
            this.age = 0;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void printOnDisplay() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", пол: " + sex);
    }
}


public class Example4 {
    public static void main(String[] args) {
        Person person = new Person(
                "Салават",
                26,
                "мужчина");
        String peopleName = person.getName();
        int peopleAge = person.getAge();
        String peopleSex = person.getSex();
        person.printOnDisplay();
        System.out.println("Имя: " + peopleName + ", возраст: " + peopleAge + ", пол: " + peopleSex);
        person.setName("Аня");
        person.setAge(-21);
        person.setSex("Женщина");
        System.out.println("Имя: " + person.getName() + ", возраст: " + person.getAge() + ", пол: " + person.getSex());
    }
}
