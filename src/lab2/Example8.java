package lab2;

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    class Cat{
        private String breed;
        private String food;
        private String fly;

        public Cat(String breed,String food, String fly){
            this.breed = breed;
            this.food = food;
            this.fly = fly;
        }
    }
    class Dog{
        private String breed;
        private String food;
        private String fly;
        public Dog(String breed,String food, String fly) {
            this.breed = breed;
            this.food = food;
            this.fly = fly;
        }
    }
    class Bird{
        private String breed;
        private String food;
        private String fly;
        public Bird(String breed,String food, String fly) {
            this.breed = breed;
            this.food = food;
            this.fly = fly;
        }
    }

}
public class Example8 {
    public static void main(String[] args) {
        Animal animal = new Animal("Леня",3);
        System.out.println(animal.getName());


    }
}
