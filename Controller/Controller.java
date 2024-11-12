package Controller;

import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Model.Card;
import Model.Deck;
import Model.Pawn;
import Model.Player;
import Model.Square;
import View.View;
import View.View.Clicklistener;

@SuppressWarnings("unused")
public class Controller {
	
	Deck deck;
    View view;
    Player player1;
    Player player2;
    Pawn redPawn1;
    Pawn redPawn2;
    Pawn yellowPawn1;
    Pawn yellowPawn2;
    
    public void initTable() {
    	
    	player1 = new Player();
    	player2 = new Player();
    	deck = new Deck();
    	deck.initCards();
    	View view = new View();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                view.setVisible(true);
                view.initComponents();
            }
        });
        
        player1.getName(View.nameFrame());
        player2.getName(View.nameFrame());
        
		
	}    
	
	public boolean GameEnded() {
		
			
			return true;
		
	}
	
	public int getChoice() {
		
		int choice = 0;
		
		boolean playerChose = true;
		
		return choice;		
		
	}
	
	public void turn(ActionEvent e) {
		
		view.rPawn1.addActionListener(view.click);
		view.rPawn2.addActionListener(view.click);
		view.yPawn1.addActionListener(view.click);
		view.yPawn2.addActionListener(view.click);
		
		int x = 170, y = 30;
		
		if(e.getSource() == View.rPawn1) {
			if(x > 10 && x < 610 && y == 30) {
				for(int m = 0; m < View.count; m++) {
					x = x - 30;
				}
			}
			
			View.rPawn1.setBounds(x, y, 25, 35);
			View.basic_panel.add(view.rPawn1);
		}
		
		if(e.getSource() == View.rPawn2) {
			
			if(x > 10 && x < 610 && y == 630) {
				for(int m = 0; m < view.count; m++) {
					x = x + 30;
				}
			}
			View.rPawn2.setBounds(x, y, 25, 35);
			View.basic_panel.add(view.rPawn2);
			
		}
		if(e.getSource() == View.yPawn1) {
			
			if(y > 30 && y < 630 && x == 610) {
				for(int m = 0; m < View.count; m++) {
					y = y - 30;
				}
			}
			View.yPawn1.setBounds(x, y, 25, 35);
			View.basic_panel.add(view.yPawn1);
			
		}
		if(e.getSource() == View.yPawn2) {
			
			if(y > 30 && y < 630 && x == 10) {
				for(int m = 0; m < View.count; m++) {
					x = x + 30;
				}
			}
			View.yPawn2.setBounds(x, y, 25, 35);			
			View.basic_panel.add(view.yPawn2);
		}
		
	}
	
	public boolean EndTurn() {
		
		if (player1.isHasFinished() || player2.isHasFinished()) {
            
            if(player1.isHasFinished())
            	view.player = player2.Name;
            else if(player2.isHasFinished())
            	view.player = player1.Name;
            
            return true;
        } 
		else {
			
            return false;
        }
		
	}
	
	/*public void checkIfItCanBePlayed(int positionOfCard) {
		
        ArrayList<Card> cardToPlay = deck.getCard();
        if (deck.movePlayer(player1, cardToPlay) == true) {
        	
            player1.setHasStarted(true);
            deck.setLastCardPlayed(cardToPlay);
            view.setLastCard(board.getLastCardPlayed());
            view.updatePawn(player1.getPosition());
            boolean gameFinished = checkIfGameFinished();
        }
        
	}
	
	private class CardListener implements MouseListener {
	       
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton but = ((JButton) e.getSource()); 
            System.out.println(but.getName());
            if (checkIfGameFinished() == true) {
                return;
            }
            int cardInPlayerPosition=Integer.parseInt(but.getName());
            if (SwingUtilities.isRightMouseButton(e)) {
                removeAndReplaceCard(cardInPlayerPosition);
            } else if (SwingUtilities.isLeftMouseButton(e)) {
                checkIfItCanBePlayed(cardInPlayerPosition);
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }*/
	
	public static void main(String[] args) {
		
		Controller c = new Controller();
        c.initTable();
		
	}
	

}
