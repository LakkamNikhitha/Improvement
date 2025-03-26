package inheritance;

 class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(name + "makes sound");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void speak() {
        System.out.println(name + "barks");
    }
}
class Main{
    public static void main(String args[]){
        Animal animal= new Animal("Animals");
        animal.speak();
        Dog dog=new Dog("buddy");
        dog.speak();
    }
}