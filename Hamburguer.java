// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

public class Hamburguer extends Item implements Collection{

	public int hams = 0;
	
	@Override
	public int calculation(int subtraction){// subtracting the actual value
		hams++;
		int result = 0;
		result = subtraction - hashItem.get("Hamburguer");
		return result;				 
	}

	@Override
	public void boughtItems() {
		System.out.println("_ "+hams+ " Hamburguer = "+hashItem.get("Hamburguer")*hams+"$");		
		
	}

	  

}
