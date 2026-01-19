package com.FitnessTracker;

public class FitnessTracker {
	public static void bubbleSort(User []users) {
		boolean swap;
		for(int i=0;i<users.length;i++) {
			swap=false;
			for(int j=0;j<users.length-i-1;j++) {
				if(users[j].steps>users[j+1].steps) {
					User temp=users[j];
					users[j]=users[j+1];
					users[j+1]=temp;
					swap=true;
				}
	}if(!swap) 
				break;  
		}
	}


public static void display(User[] users) {
    int rank=1;
    for (User u:users) {
        System.out.println(rank +  u.name +  u.steps + " steps");
        rank++;
  }
}

public static void main(String[] args) {

    User[] users = { new User("ishan", 5200), new User("harshit", 8000),new User("Amit", 6500), new User("Priya", 9000)};

    System.out.println( "before Sorting:");
    display(users);

    bubbleSort(users);

    System.out.println("after sorting:");
    display(users);
}
}
