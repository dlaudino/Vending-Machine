// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

public class IceCream extends Item implements Collection {
	
	public int ice = 0;

	  @Override
	  public int calculation(int subtraction){// subtracting the actual value
		  ice++;
		  int result = 0;
		  result = subtraction - hashItem.get("Ice Cream");
		  return result;				 
	  }

	@Override
	public void boughtItems() {
		System.out.println("_ "+ice+ " Ice Cream = "+hashItem.get("Ice Cream")*ice+"$");			
	}

}
