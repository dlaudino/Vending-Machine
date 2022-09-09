// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

public class Lemonade extends Item implements Collection {
	
	public int lemon = 0;

	  @Override
	 public int calculation(int subtraction){ // subtracting the actual value
		  lemon++;
		  int result = 0;
		  result = subtraction - hashItem.get("Lemonade");
		  return result;				 
	 }

	@Override
	public void boughtItems() {
		System.out.println("_ "+lemon+ " Lemonade = "+hashItem.get("Lemonade")*lemon+"$");			
	}


}
