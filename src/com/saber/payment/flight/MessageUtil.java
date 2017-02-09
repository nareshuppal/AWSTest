package com.saber.payment.flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MessageUtil {

public static void main(String args[])
	{
	
	List<SaberFlight> UnsortedFlightList= new ArrayList<SaberFlight>();
	UnsortedFlightList.add(new SaberFlight("0041","009"));
	sortByFlightNumber(UnsortedFlightList);
	}

 public static  List<SaberFlight> sortByFlightNumber(List<SaberFlight>  UnsortedFlightList)
 {
	 

	 Collections.sort(UnsortedFlightList, new Comparator<SaberFlight>(){
		 public int compare(SaberFlight s1, SaberFlight s2)
		 {
			 
			 return s1.getFligtNumber().compareTo(s2.getFligtNumber());
		 }});
	 
	 return UnsortedFlightList;
   }
 

	 
	   private String message;
	
	   //Constructor
	   //@param message to be printed..
		
	   public MessageUtil(String message){
	      this.message = message;
	   }
	      
	   // prints the message
	   public String printMessage(){
	      System.out.println(message);
	      return message;
	   }  
   
}  