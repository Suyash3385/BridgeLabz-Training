package EduMentor;
import java.util.*;
abstract class User {
String name;
String email;
int id;
 User(String name,String email,int id){
	 this.name=name;
	 this.email=email;
	 this.id=id;
	 
 }
 public abstract void displayRole();  
}
