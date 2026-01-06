package PetPal;
class Cat extends Pet{
    Cat(String name, int age){
        super(name, "Cat",age);
 }
    public void feed(){
        changeHunger(-15);
        changeMood(+5);
        System.out.println(name + " eating quietly");
    }
    public void play(){
        changeEnergy(-15);
        changeMood(+15);
        System.out.println(name + " chasing a toy");
 }
    public void sleep() {
        changeEnergy(+25);
        System.out.println(name + "  napping");
 }
    void makeSound() {
        System.out.println(name + "  Meow");
 }
}

