package com.blueyonder.questions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class countDays {
   public static void main(String[] args)
   {
	   try {
		   String date1,date2;
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter Date1");
		   int d1,m1,y1;
		   System.out.println("enter date ");
		   d1=sc.nextInt();
		   System.out.println("enter month");
		   m1=sc.nextInt();
		   System.out.println("enter year");
		   y1=sc.nextInt();
		   
		   System.out.println("Enter Date2");
		   int d2,m2,y2;
		   System.out.println("enter date ");
		   d2=sc.nextInt();
		   System.out.println("enter month");
		   m2=sc.nextInt();
		   System.out.println("enter year");
		   y2=sc.nextInt();
		   
		   LocalDate start = LocalDate.of(y1, m1, d1);
		    LocalDate end = LocalDate.of(y2, m2, d2);
		    Period period = Period.between(start, end);
		    int days = period.getDays();
		    System.out.println(days); 
		  
		   
			   
	   }
	   catch(Exception e)
	   {
		   System.out.println("Date is invalid");
	   }
	   
	   
	   
	  
	   
   }
}
