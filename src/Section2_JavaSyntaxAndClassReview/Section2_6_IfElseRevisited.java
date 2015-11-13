package Section2_JavaSyntaxAndClassReview;

public class Section2_6_IfElseRevisited {
	public static void main(String[] args) {
		//Lecture 6
				double defaultTicketPrice = 10.0;
				double discount = .1;
				double ticketPrice = defaultTicketPrice;
				int age =30;
				if(age<18)
				{
					//give customer 10% discount
					ticketPrice = ticketPrice - ticketPrice*discount;
					System.out.println("This is the ticket price: " + ticketPrice);
					
				}
				else if (age<25)//has to be greater than 18 or equal to 
					{
						//give customer discount of 5%
						ticketPrice = ticketPrice - ticketPrice*.05;
						System.out.println("This is the ticket price: " + ticketPrice);
					}
				else{// customer has to be greater than 25 at this point 
						//Dont give discount
					}
				
				System.out.println(ticketPrice);
				
	}
}
