package lab2;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}

class Dog extends Animal {
    private String bark;
    private String breed;

    public Dog(String name, int age, String bark,String breed) {
        super(name, age);
        this.bark = bark;
        this.breed = breed;
    }

    public String getBark() {
        return bark;
    }
    public String getBreed() {
        return breed;
    }
//    public void setBark(String bark) {
//        this.bark = bark;
//    }

//    public void setBreed(String breed) {
//        this.breed = breed;
//    }

    public void print(){
        System.out.println(getName()+" "+getAge()+" лет, порода "+ getBreed() +" и он много " + getBark()+"!");
    }
}
class Cat extends Animal{
    private String voice;
    private String breed;

    public Cat(String name, int age, String voice, String breed) {
        super(name, age);
        this.voice = voice;
        this.breed = breed;
    }
    public void print(){
        System.out.println("Мою кошку зовут "+getName()+", она породы "+ breed +" ей уже " + getAge() + " лет и она говорит " + voice);
    }
}
class Beard extends Animal{
    private String fly;

    public Beard(String name, int age, String fly) {
        super(name, age);
        this.fly = fly;
    }

    public String getFly() {
        return fly;
    }
    public void print(){
        System.out.println("Это "+ getName() + " ему " + getAge()+ " года и он умеет " + getFly());
    }
}

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Тэди", 5, "лает", "волкодав");
        dog.print();
        Cat cat = new Cat("Мурка", 9, "мяу", "свинкс");
        cat.print();
        Beard beard = new Beard("Кеша", 3, "летать");
        beard.print();
    }
}
