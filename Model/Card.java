package Model;

public class Card{
	
	int value;
    String image;
	
    public String getImage() {
    	
        return image;
    }
    
    public void setImage(String image) {
    	
    	this.image = image;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
    	
        this.value = value;
        
    }    	
}

class NumCard extends Card{
	
	public boolean NumC() {
		
		return true;
	}
}

class SimpleCard extends NumCard{{

	super.NumC();
	super.getValue();
	
}}

class Num1Card extends NumCard{{
	
	super.value = 1;
	
}}

class Num2Card extends NumCard{{
	
	setValue(2);
}}

class Num4Card extends NumCard{{
	
	setValue(4);
		
}}

class Num7Card extends NumCard{{
	
	setValue(7);
	
}}

class Num10Card extends NumCard{{
	
	setValue(10);
	
}}

class Num11Card extends NumCard{{
	
	setValue(11);
	
}}

class SorryCard extends Card{
	
	public boolean Sorry() {
		
		return true;
		
	}	
}

