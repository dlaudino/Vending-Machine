// Derek Laudino
// Project Design REVENTURE
// 09/06/2022

public class Coke extends Item implements Collection {
	
	public int cokes = 0;

	@Override
	public int calculation(int subtraction){// subtracting the actual value
		cokes++;
		int result = 0;
		result = subtraction - hashItem.get("Coke");
		return result;				 
	}

	@Override
	public void boughtItems() {
		System.out.println("_ "+cokes+ " Coke = "+hashItem.get("Coke")*cokes+"$");		
	}
		   
}
