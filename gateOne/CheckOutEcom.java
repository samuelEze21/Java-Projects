import java.util.Scanner;
import java.util.ArrayList; 


public class CheckOutEcom {
  public static void main(String [] args) {

	Scanner input = new Scanner(System.in); 

	ArrayList<String> itemsPurchased = new ArrayList<String>(); 
	ArrayList<Integer> quantityPurchased = new ArrayList<Integer>(); 
	ArrayList<Double> priceItems = new ArrayList<String>(); 
	ArrayList<Double> totalPrice = new ArrayList<String>(); 


	System.out.println("What is the Name of this customer?: "); 
	customerName = input.nextScanner(); 


	System.out.println("What did the customer purchase?: "); 
	itemPurchased.add(input.nextline()); 
	
	System.out.println("How many quantity did they purchase?: "); 
	quantityPurchased.add(input.nextline()); 

	System.out.println("How much per unit?: "); 
	priceItems.add(input.nextline()); 





3. second refinement: 

- collect inputs;

1. what is the customer's name? = Initialize variable for customerName; 


2. what did the customer purchase? = initialize variable and add to array itemPurchased;


3. how many pieces of this item did the user purchase? = initialize variable and add to array quantityPurchased; 


4. how much per unit? = initialize variable and add to array priceItems; 




5. Do you want more items? = ( Use sentinel, while userInput != "no" yes == continue) 

6. what are you buying next? = add to array itemPurchased; 

7. How many pieces of this item do you want to buy? = add to array quantityPurchased; 

8. how much per unit? = add to array priceItems; 

9. Do you want more items = ( No ) 

10. What is your name (cashier)? = initialize variable for cashierName; 

11. How much discount will customer get? = initialize to variable (discountedAmount = subAmount / 100 x 8) 










pseudocode:

1. top = develop an ecommerce checkout for semicolon store that sells variety of products and a checkout system 
that allows the cashier to enter the product details in the user's cart to display product and quantity purchased, 
and display it as customers invoice, computes customer's total amount, discount and vat of 7.5% of the total price.



2. first refinement:

- initialize variables for; 
1. variety of products (product types and Qtty) 
2. price of products
3. total amount purchased by customer (total price) 
4. item purchased
5. Sum of total purchase: subtotal (before vat)
6 discounted amount 
7. vatValue 

//8. user cart (total product and qtty purchased) 




--------------------------------------

checkout ecommerce; 

You have been hired to develop an ecommerce checkout system for semicolon store.

1. the store sells a variety of products, and each products has a name and a price.

2. implement a checkout system for the store that allows the cashier do the following; 

-  enter each product details in the user's cart - product and quantity purchased 
- display customer's invoice
- computes total, discount and VAT OF 7.5% total price

