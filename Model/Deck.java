package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	Card lastCardPlayed;
	ArrayList<Card> card;
	
	public ArrayList<Card> getGameCards() {
		
        return Cards;
    }
	
	public void setGameCards(ArrayList<Card> gameCards) {
		
        this.Cards = gameCards;
    }
	
	ArrayList<Card> Cards = new ArrayList<Card>();
	
    public void initCards() {
    	
        for (int i = 0; i < 11; i++) {
        	
            Card card = new Card();
            SorryCard sorryCard = new SorryCard();
            card.setImage("resources/images/card" + (i % 12 + 1) + ".png");
            sorryCard.setImage("resources/images/sorryCard.png");
            Cards.add(card);
            Cards.add(sorryCard);
        }
        
        Collections.shuffle(Cards);
    }
    
    public ArrayList<Card> getCard() {
        return card;
    }
    
    public Card getLastCardPlayed() {
    	
        return lastCardPlayed;
        
    }
    
    public void setLastCardPlayed(Card lastCardPlayed) {
    	
        this.lastCardPlayed = lastCardPlayed;
    }
	
	public void Fold() {
		
	}
	
	public void DrawCard() {
		
	}
	
	public void removeCard(Card c) {
		
	}

}
