package OOP;

public class Main {
	/* Ben Jay Sullera
	 * yvonnie Durano
	 * Karen Jugdong
	 * Mac Jason Bronola
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Racket donic = new Racket("donic", "Table Tennis", 1000);
		  
		System.out.println ("Name: "+ donic.getName());
		System.out.println ("Category: "+ donic.getCategory());
		System.out.println ("Price: "+ donic.getPrice() + "\n");
		   
		Racket sanwei = new Racket("Sanwei-T88 3", "Table Tennis", 500);
		sanwei.Display();
		  
		Racket butterfly = new Racket("Tenergy", "Table Tennis", 1500);
		butterfly.Display();
		  
		butterfly.setName("Tenergy 05");
		butterfly.setCategory("Table Tennis");
		butterfly.setPrice(2000);
		  
		   
		butterfly.Display();
		
        Racket yonex = new Racket();
        
        yonex.setName("Yonex");
        yonex.setCategory("Badminton");
		yonex.setPrice(4000);
		  
		System.out.println ("Name: "+ yonex.getName());
		System.out.println ("Category: "+ yonex.getCategory());
		System.out.println ("Price: "+ yonex.getPrice() + "\n");	  
	  }	

	}


