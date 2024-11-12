package Model;

public class Square {
	
	public boolean checkIfTaken(Pawn pawn) {
		
		return true;
		
	}
}

class Start extends Square{
	
	public boolean startSquare(Pawn pawn) {
		
		return true;
		
	}
	
}

class Simple extends Square{
	
	public boolean simpleSquare(Pawn pawn) {
		
		return true;
		
	}
	
}

class Slide extends Square{
	
	public boolean slideSquare(Pawn pawn) {
		
		return true;
		
	}
	
}

class startSlide extends Slide{
	
	public boolean stSlide(Pawn pawn) {
		
		return true;
		
	}
	
}

class interSlide extends Slide{
	
	public boolean intSlide(Pawn pawn) {
		
		return true;
		
	}
	
}

class endSlide extends Slide{
	
	public boolean SlideEnd(Pawn pawn) {
		
		return true;
		
	}
	
}

class SafetyZone extends Square{
	
	public boolean SafeZone(Pawn pawn) {
		
		return true;
		
	}
	
}

class Home extends Square{
	
	public boolean Spiti(Pawn pawn) {
		
		return true;
		
	}
	
}

