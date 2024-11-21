package Vehicles;

import java.util.Scanner;

public class testvehicles {		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cargosize =11; 
		double tirenum = 13;
		double fueleconcity = 14;
		double fueleconhwy = 15;
		double seatingcapacity = 16;
		boolean sunroof =false;
		boolean backseatent =true;
		boolean trunksenser = false ;
		double backbed = 8;

		car carr = new car(4,4,1,2,5,true);
		truck trunnnk = new truck(2,7,5,4,9,3);
		minivan mini = new minivan(2,7,5,4,9,true,false);
		
		System.out.println(carr);
		System.out.println(" ");
		System.out.println(trunnnk);
		System.out.println(" ");
		System.out.println(mini);
		System.out.println(" ");
		
		
		
		
		
		car usercar = new car(0, 0, 0, 0, 0, false);
		usercar.settrunksenser(trunksenser);
		usercar.settirenum(tirenum);
		usercar.setcargosize(cargosize);
		usercar.setfueleconC(fueleconcity);
		usercar.setfueleconH(fueleconhwy);
		usercar.setseatingcapa(seatingcapacity);
		System.out.println(usercar);
		System.out.println(" ");
		
		truck usertruck = new truck(0, 0, 0, 0, 0,0);
		usertruck.settirenum(tirenum);
		usertruck.setcargosize(cargosize);
		usertruck.setfueleconC(fueleconcity);
		usertruck.setfueleconH(fueleconhwy);
		usertruck.setseatingcapa(seatingcapacity);
		usertruck.setBBS(backbed);
		System.out.println(usertruck);
		System.out.println(" ");
		
		minivan usermini = new minivan(0, 0, 0, 0, 0, false, false);
		usermini.setBSE(backseatent);
		usermini.setsunroof(sunroof);
		usermini.settirenum(tirenum);
		usermini.setcargosize(cargosize);
		usermini.setfueleconC(fueleconcity);
		usermini.setfueleconH(fueleconhwy);
		usermini.setseatingcapa(seatingcapacity);
		System.out.println(usermini);
		System.out.println(" ");
		
		
		
		System.out.println("this is usercar cargo size " + usercar.getcargosize());
		System.out.println(" ");
		System.out.println("this is usercar fuel economy city " + usercar.getfueleconC());
		System.out.println(" ");
		System.out.println("this is usercar fuel economy highway " + usercar.getfueleconH());
		System.out.println(" ");
		System.out.println("this is usercar cargo seating capacity " + usercar.getseatingcapa());
		System.out.println(" ");
		System.out.println("this is usercar tirenumber " + usercar.gettirenum());
		System.out.println(" ");
		System.out.println("this is usercar if it has trucksenser " + usercar.gettrunksenser());
		System.out.println(" ");
		System.out.println("this is usermini if back seat entertainment " + usermini.getBSE());
		System.out.println(" ");
		System.out.println("this is usermini if sunroof " + usermini.getsunroof());
		System.out.println(" ");
		System.out.println("this is usertruck bedsize " + usertruck.getBBS());
		System.out.println(" ");
		
		System.out.println(usertruck.toString());
		System.out.println(" ");
		System.out.println(usercar.toString());
		System.out.println(" ");
		System.out.println(usermini.toString());
		
	}

}

//screen dump1
/*
 * 
 * Cargosize is4.0 
 and tire number is 4.0 
 and the fuel economy for city is 1.0 
 and fuel economy for highways is 2.0 
 and seating capacity is 5.0
 if it has a trunksenser true
 
Cargosize is2.0 
 and tire number is 7.0 
 and the fuel economy for city is 5.0 
 and fuel economy for highways is 4.0 
 and seating capacity is 9.0
 the size of the bed is 3.0
 
Cargosize is2.0 
 and tire number is 7.0 
 and the fuel economy for city is 5.0 
 and fuel economy for highways is 4.0 
 and seating capacity is 9.0
 if it has a sunroof true
 and if it has back seat entertainment false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a trunksenser false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 the size of the bed is 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a sunroof false
 and if it has back seat entertainment true
 
this is usercar cargo size 11.0
 
this is usercar fuel economy city 14.0
 
this is usercar fuel economy highway 15.0
 
this is usercar cargo seating capacity 16.0
 
this is usercar tirenumber 13.0
 
this is usercar if it has trucksenser false
 
this is usermini if back seat entertainment true
 
this is usermini if sunroof false
 
this is usertruck bedsize 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 the size of the bed is 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a trunksenser false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a sunroof false
 and if it has back seat entertainment true

 */

//screen dump 2
/*
 * Cargosize is4.0 
 and tire number is 4.0 
 and the fuel economy for city is 1.0 
 and fuel economy for highways is 2.0 
 and seating capacity is 5.0
 if it has a trunksenser true
 
Cargosize is2.0 
 and tire number is 7.0 
 and the fuel economy for city is 5.0 
 and fuel economy for highways is 4.0 
 and seating capacity is 9.0
 the size of the bed is 3.0
 
Cargosize is2.0 
 and tire number is 7.0 
 and the fuel economy for city is 5.0 
 and fuel economy for highways is 4.0 
 and seating capacity is 9.0
 if it has a sunroof true
 and if it has back seat entertainment false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a trunksenser false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 the size of the bed is 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a sunroof false
 and if it has back seat entertainment true
 
this is usercar cargo size 11.0
 
this is usercar fuel economy city 14.0
 
this is usercar fuel economy highway 15.0
 
this is usercar cargo seating capacity 16.0
 
this is usercar tirenumber 13.0
 
this is usercar if it has trucksenser false
 
this is usermini if back seat entertainment true
 
this is usermini if sunroof false
 
this is usertruck bedsize 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 the size of the bed is 8.0
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a trunksenser false
 
Cargosize is11.0 
 and tire number is 13.0 
 and the fuel economy for city is 14.0 
 and fuel economy for highways is 15.0 
 and seating capacity is 16.0
 if it has a sunroof false
 and if it has back seat entertainment true

 * 
 * 
 */
