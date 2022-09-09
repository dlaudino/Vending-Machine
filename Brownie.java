// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

public class Brownie extends Item implements Collection{
	
	public int brow = 0;

	  @Override
	  public int calculation(int subtraction){// subtracting the actual value
		  brow++;
		  int result = 0;
		  result = subtraction - hashItem.get("Brownie");
		  return result;				 
	  }

	@Override
	public void boughtItems() {
		System.out.println("_ "+brow+ " Brownie = "+hashItem.get("Brownie")*brow+"$");			
		
	}
	  
}
