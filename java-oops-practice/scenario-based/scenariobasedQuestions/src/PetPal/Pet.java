package PetPal;
	 import java.util.Random;
	abstract class Pet implements IInteractable {
	    protected String name;
	    protected String type;
	    protected int age;
	    private int hunger;   
	    private int energy;   
	    private int mood;    
	    Pet(String name,String type,int age){
	        Random r=new Random();
	        this.name=name;
	        this.type=type;
	        this.age = age;
	        this.hunger=r.nextInt(40)+30;
	        this.energy=r.nextInt(40)+40;
	        this.mood=r.nextInt(40)+40;
	   }
	    protected void changeHunger(int value){
	        hunger=Math.max(0, Math.min(100, hunger+value));
	     }
	    protected void changeEnergy(int value) {
	        energy=Math.max(0, Math.min(100, energy+value));
	   }
	    protected void changeMood(int value){
	        mood=Math.max(0, Math.min(100,mood+value));
	        }
	    public void showStatus(){
	        System.out.println("Name: " +name);
	        System.out.println("Type: " +type);
	        System.out.println("Age: " +age);
	        System.out.println("Hunger: " +hunger);
	        System.out.println("Energy: " +energy);
	        System.out.println("Mood: " +mood);
	    }
	    abstract void makeSound();
	    }


