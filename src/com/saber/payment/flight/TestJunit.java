package com.saber.payment.flight;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
   
   @Test
   public void testSaberList()
   {
	List<SaberFlight> UnsortedFlightList=new ArrayList<SaberFlight>();
	UnsortedFlightList.add(new SaberFlight("001","001"));
	UnsortedFlightList.add(new SaberFlight("004","001"));
	UnsortedFlightList.add(new SaberFlight("005","001"));
	UnsortedFlightList.add(new SaberFlight("002","001"));
	UnsortedFlightList.add(new SaberFlight("003","001"));
	
	MessageUtil.sortByFlightNumber(UnsortedFlightList);
	for(SaberFlight saberFlight: UnsortedFlightList){
		System.out.println("Saber Flkight"+saberFlight.getFligtNumber());
	}
	
   }
}