package com.eventmanager;

public class EventManager {
	public void quickSort(Ticket[]tickets,int low,int high) {
		if(low<high) {
			int pivot=partition(tickets,low,high);
			quickSort(tickets,low,pivot-1);
			quickSort(tickets,pivot+1,high);
     }
	}
	public static int partition(Ticket []tickets, int low,int high) {
        double pivot=tickets[high].getPrice();
        int i=low-1;
        for(int j=low;j<high;j++){
            if(tickets[j].getPrice()<pivot){
                i++;
                Ticket temp=tickets[i];
                tickets[i]=tickets[j];
                tickets[j]=temp;
          }
        }
        Ticket temp=tickets[i+1];
        tickets[i+1]=tickets[high];
        tickets[high]=temp;
        return i+1;
    }
    public void printTickets(Ticket[]tickets) {
        for (Ticket t:tickets) {
            System.out.println(t);
        }
    }
	}


