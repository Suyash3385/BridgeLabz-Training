package PetPal;
class Dog extends Pet {

    Dog(String name, int age){
        super(name, "Dog",age);
    }
    public void feed(){
        changeHunger(-20);
        changeMood(+10);
        System.out.println(name + " enjoyed the food");
  }
    public void play(){
        changeEnergy(-20);
        changeMood(+20);
        System.out.println(name + " playing fetch");
  }
    public void sleep(){
        changeEnergy(+30);
        System.out.println(name + "  sleeping peacefully");
 }
    void makeSound(){
        System.out.println(name + "  Woof Woof");
 }
}
