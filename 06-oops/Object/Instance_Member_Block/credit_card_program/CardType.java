package day_33.credit_card_program;

public class CardType {
  private Customer customer;
  private String cardType;
  
  
  public CardType(Customer customer, String cardType) {
	super();
	this.customer = customer;
	this.cardType = cardType;
  }


  @Override
  public String toString() {
	return "Customer '"+customer+"' is Eligible For '"+cardType+"' Card";
  }
  
  
}


