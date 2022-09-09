// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scan = new Scanner(System.in);

		  System.out.println();
		  System.out.println("* Welcome to Derek's Vending Machine! I am very happy to see you here.");
		  System.out.println("* To start enter your first name:");
		  String userName = scan.nextLine();  // Read first (name) ******
		    
		  System.out.println("* Hello " + userName + "! How many coins do you have? Display an integer:");
		  int coins = scan.nextInt();  // Read coins *********
		  
		  Item objItem = new Item(); // creating Item Object    &&&&&&&&&&&& Object &&&&&&&&&&&&&
		  Item intName = new Item(userName, coins);// Item Obje &&&&&&&&&&&& Object &&&&&&&&&&&&&
		  
		  ChooseItem choItem = new ChooseItem(); // Switch statement
		  Lemonade lem = new Lemonade();
		  Coke coke = new Coke();
		  Hamburguer hamburguer = new Hamburguer();
		  IceCream iceCream = new IceCream();
		  Brownie brownie = new Brownie();

	  
		while(coins>0){// ************************************* While loop **********************
			
		  objItem.displayItem();
		  System.out.println("* With "+ coins +" coins, you can choose to buy some items from Derek's Vending Machine.");  
		  System.out.print("* These are the items and their prices.");
		  
		  int item = 0;
	      do { // Exeption when user display wrong number
	        try{
	          System.out.println(" Choose one of them by typing its item number:");
	          item = scan.nextInt();  // Read coins *********
	        }catch(Exception e) {
	          System.out.println("* The index you have entered is invalid.");
	          System.out.println("* Please enter an index number between 1 and 6.");
	          scan.nextLine();
	        }        
	      } while (item < 1 || item > 6);
	      
	      
	      if (coins >= 7) {
	      		choItem.choseItem1(item); // chosing the product
	  	      if(item == 1){
	  	        coins = iceCream.calculation(coins); // actual value 
	  	      }else if(item == 2){
	  	        coins = hamburguer.calculation(coins);//actual value
	  	      }else if(item == 3){
	  	        coins = lem.calculation(coins);//actual value
	  	      }else if(item == 4){
	  	        coins = brownie.calculation(coins);//actual value
	  	      }else if(item == 5){
	  	        coins = coke.calculation(coins);//actual value
	  	      }else if(item == 6){
			      System.out.println();
	  	    	  break;
		  	   }
		      System.out.println();

	      }else if (coins < 7 && coins >= 4 && item!=2) {
	      		choItem.choseItem1(item); // chosing the product 
	  	      if(item == 1){
	  	        coins = iceCream.calculation(coins); // actual value 
	  	      }else if(item == 3){
	  	        coins = lem.calculation(coins);//actual value
	  	      }else if(item == 4){
	  	        coins = brownie.calculation(coins);//actual value
	  	      }else if(item == 5){
	  	        coins = coke.calculation(coins);//actual value
	  	      }else if(item == 6){
			      System.out.println();
	  	    	  break;
		  	   }
		      System.out.println();

	      }else if(coins == 3 && item!=2 && item!=3) {
	      		choItem.choseItem1(item); // chosing the product 
	      		 if(item == 1){
	     	        coins = iceCream.calculation(coins); // actual value 
	     	     }else if(item == 4){
	     		    coins = brownie.calculation(coins);//actual value
	     		 }else if(item == 5){
	     		    coins = coke.calculation(coins);//actual value
	     		}else if(item == 6){
				      System.out.println();
		  	    	break;
			  	}
			      System.out.println();

	      }else if(coins == 2 && item!=3 && item!=5 &&item!=2) {
	      		choItem.choseItem1(item); // chosing the product 
	      		if(item == 1){
	    	        coins = iceCream.calculation(coins); // actual value 
	    	      }else if(item == 4){
	    		        coins = brownie.calculation(coins);//actual value
	    		  }else if(item == 6){
				      System.out.println();
		  	    	  break;
			  	   }	 
			      System.out.println();

	      }else if(coins == 1 && item!=3 && item!=5 && item!=1 && item!=2) {
	      		choItem.choseItem1(item); // chosing the product
		        coins = brownie.calculation(coins);//actual value
	      		if(item == 6){
				      System.out.println();
	      			break;
	      		}	
			      System.out.println();

	      }else {
		      System.out.println();
	          System.out.println("* You do not have enough coins for item " + item+ ".");
	      }
	      
	      
	      if(intName.calculation(coins) == 1) {
		  System.out.println("You spent " +intName.calculation(coins)+ " coin so far."); // You spent ....	      
	      }else{
	      System.out.println("You spent " +intName.calculation(coins)+ " coins so far."); // You spent ....	      
	      }
	      
		 } // ************************************* While loop ***********************
		
		       
		System.out.println("You bought:");
		iceCream.boughtItems();
		hamburguer.boughtItems();
		lem.boughtItems();
		brownie.boughtItems();
		coke.boughtItems();		
		System.out.println("It was a pleasure to have you here " + intName.getName()+"! Have a good Day.");
		scan.close(); // closing scanner



	}

}
