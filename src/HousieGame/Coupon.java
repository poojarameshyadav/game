package HousieGame;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import HousieGame.Cells;
public class Coupon {
	int col,row;
	Cells[][] cells;
	int cellperRow;
	int blankspace;
	public Coupon(int row,int col,int cellperRow)
	{
	this.cells= new Cells[row][col];
	  this.cellperRow=cellperRow;
	  
	  this.col=col;
	  this.row=row;
	  for(int i=0;i<this.row;i++)
	  {
		  for(int j=0;j<this.col;j++)
		  {
		    this.cells[i][j]=new Cells("0");	  
		  }
	  }
	  }
	
	public int[][] generatecol()
	{
		int[][]array=new int[3][9];//intialise the array
	//(array,5);
		for(int i=0;i<col;i++)
		{
			int colsort[]=new int[row];//for sorting
			int min=i*10+1,max=i*10+10;//min and max value
		
			//while loop
		for(int j=0;j<row;j++)
				{
			int cell=ThreadLocalRandom.current().nextInt(min,max);

	   				for(int k=0;k<row;k++)//to check the col wheather the value is exist
	   				{
	   					if(cell==array[k][i])
	   				  {
	   				 cell=ThreadLocalRandom.current().nextInt(min,max);
	   				 k=-1;

	   				  }

	   			    }
	   				array[j][i]=cell;
	   		   		colsort[j]=array[j][i];
	
	   			}
	   	Arrays.sort(colsort);
		for(int k=0;k<row;k++)
		{
			array[k][i]=colsort[k];//1D is converted into 2d array
		}
		}
	
		//for printing value
		for(int i=0; i<row;i++) {

	  		System.out.println("----------------------------------------------------------");

	      	    for(int j=0;j<col;j++){

	      	    	int val=array[i][j];

	      	    	Cells cs=new Cells("");

	      	    	cs.setValue(val);

	      	    	cs.getValue();
	      	    	
	            }
	      	  System.out.println("-------------------------------------------------------");

	      	
        } 
		return array;
		}
	
	public int[][] blankspaceforRow(int cells[][],int cellperRow)
	{
	
		 blankspace=col-cellperRow;
		 while(blankspace!=5)
		 {
			 blankspace=ThreadLocalRandom.current().nextInt(0,col);
			 if()
			 {
				 
			 }
			 
		 }
		 
		 System.out.println("number of blankspace = " +blankspace);
		return cells;	
	}
	
	
		
	}


