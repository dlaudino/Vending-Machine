// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

import java.util.HashMap; // import the HashMap class

public class Item {

	 //creating a hashMap
	  HashMap<String, Integer> hashItem = new HashMap<String, Integer>();
	  private int coin;
	  private String name;
	  
	  public Item(){ // conctructor for the hasMap with 5 items!
	    hashItem.put("Ice Cream", 2);
	    hashItem.put("Brownie", 1);
	    hashItem.put("Hamburguer", 7);
	    hashItem.put("Coke", 3);
	    hashItem.put("Lemonade", 4);
	  }
	  
	  public Item(String name, int coin) { // constructor
		  this.name = name;
		  this.coin = coin;
	  }
	  
	  public int getCoin(){ // getting coin
	    return coin;
	  }
	  
	  public void setCoin(int coin){
	    this.coin = coin;
	  }
	  
	  public String getName(){ // getting name
		    return name;
	  }

	  public void displayItem(){ // Displaying items
	    int t = 1;
	    for(String i: hashItem.keySet()){
	      System.out.println(t+"- "+i+" = "+hashItem.get(i)+"$");   
	      t++;
	    }  
	    System.out.println("6- Leave Vending Machine");
	  }
	  
	  public int calculation(int subtraction){ // Spent money!
		int result = 0;
		result = coin - subtraction;
		return result;				 
	  }
	  
}

