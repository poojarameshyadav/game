package HousieGame;

import java.util.ArrayList;
import java.util.HashSet;

public class Cells
{
	private String value;
	private String black;
      
	public String getValue() {
		return value;
	}
	public String getBlack() {
		return black;
	}

	public void setBlack(String black) {
		this.black = black;
	}
	
	public Cells(String value) {
		this.value = value;
	}

	public void setValue(int val) {
		this.value = String.valueOf(val);
		//HashSet<Integer> set=new HashSet<Integer>();
		ArrayList<Integer> set=new ArrayList<Integer>();

	    	set.add(val);

		for(Integer i1:set) {

	    		System.out.print(i1+" | ");
	    		
	}



	}


	

}
