package PetPal;
class Bird extends Pet {
    Bird(String name, int age) {
        super(name, "Bird", age);
  }
    public void feed(){
        changeHunger(-10);
        changeMood(+5);
        System.out.println(name + " pecking seeds");
 }
    public void play(){
        changeEnergy(-10);
        changeMood(+10);
        System.out.println(name + "  flying around");
 }
    public void sleep() {
        changeEnergy(+20);
        System.out.println(name + " resting in its nest");
 }
    void makeSound() {
        System.out.println(name + "  Tweet Tweet");
 }
}
 
