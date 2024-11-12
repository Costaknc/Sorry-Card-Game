package Model;

import java.util.ArrayList;

public class Player {
	
	public String Name = new String();
	
	public String getName(String Name) {
		
		return Name;
		
	}
	
	 ArrayList<Card> cards=new ArrayList<Card>();
	    
	 boolean hasStarted=false,hasFinished=false;
	
	public boolean isHasStarted() {
		
        return hasStarted;
        
    }
		
	public void yourMove(boolean hasSrarted) {
		
		this.hasStarted = hasStarted;
		
	}
	
	public boolean isHasFinished() {
		
        return hasFinished;
    }

    public void notYourMove(boolean hasFinished) {
    	
        this.hasFinished = hasFinished;
        
    }
	
}


