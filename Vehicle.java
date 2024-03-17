package in.ass2;

import in.ass.Student;

public class Vehicle {
		public void car(String Name,int price) {
			
			System.out.println("name of car:" +Name);
			System.out.println("price of car:" +price);
		}
		public void car(String colour,float weight) {
		
			System.out.println("colour of car:" +colour);
			System.out.println("weight of car:" +weight);
		}
		
	        public static void main(String args[]){
	        	
	        Vehicle veh=new Vehicle();
	        veh.car("ABC",1000000);
	        veh.car("White",135.57f);
	      
	        }
	}

