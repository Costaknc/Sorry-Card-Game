package Model;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener; 
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import View.View;

public class Pawn {
	
	int position = -1;
	
	public void getPosition(Pawn pawn) {
		
		//Point location = pawn.getLocation();
		
	}
	
	public void movePawnForward(int moveNum) {
		
		this.position += moveNum;
	}
	
	public void movePawnBack(int moveNum) {
		
		this.position -= moveNum;
		
	}
	
	public boolean npp( ) {
		
		return true;
		
	}
	
	public int pawnPos(int pawn) {
		
		int pawnPos = 0;
		
		return pawnPos;
		
	}
	
	public void exchangePawns(int squarePos1, int squarePos2){
		
		/*Transformer(Mutative)
		 * it exchanges the number of the positions (or just renames the pawns)
		 * 
		 */
		
	}
	
	public boolean checkValid() {
		
		return true;
		
	}
	
	public boolean takeToStart(int pawn) {
		
		return true;
		
	}

}
