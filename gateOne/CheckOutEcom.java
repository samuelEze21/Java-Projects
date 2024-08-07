import java.util.ArrayList; 
import java.util.Scanner;


public class CheckOutEcom {
  public static void main(String [] args) {

	Scanner input = new Scanner(System.in); 

	ArrayList<String> itemsPurchased = new ArrayList<String>(); 
	ArrayList<Integer> quantityPurchased = new ArrayList<Integer>(); 
	ArrayList<Double> priceOfItems = new ArrayList<Double>(); 

	ArrayList<Double> totalPerItem = new ArrayList<Double>(); 

	Double subTotal = 0.0; 
	Double vatAmount = 0.0; 
	Double billTotal = 0.0;
	Double amountPaid = 0.0; 
	Double customerBalance = 0.0; 

	int discountedAmount = 0;

	String AddGoodsOrStopNow = "yes"; 


	System.out.println("What is Customer's Name?: "); 
	String customerName = input.nextLine(); 



	while(AddGoodsOrStopNow.equalsIgnoreCase("yes")){

		System.out.println("What item did the customer purchase?: "); 
		itemsPurchased.add(input.nextLine()); 
	
		System.out.println("How many quantity of the item purchased?: "); 
		quantityPurchased.add(Integer.parseInt(input.nextLine()));

		System.out.println("How much per unit?: ");
		priceOfItems.add(Double.parseDouble(input.nextLine()));

		System.out.println("Add More items?: "); 
		AddGoodsOrStopNow = input.nextLine(); 

		}


	System.out.println("what is your name?: "); 
	String cashierName = input.nextLine(); 


	System.out.println("Howmuch Discount(%) will the user get?: "); 
	discountedAmount = input.nextInt(); 


	System.out.println("SEMICOLON STORES "); 
	System.out.println("MAIN BRANCH "); 
	System.out.println("LOCATION: 312, HERBERT MACUALY WAY, SABO YABA, LAGOS.  STORES "); 
	System.out.println("TEL: 032938343 "); 
	System.out.println("Date: 07-Aug-24 8:34:10 pm"); 
	System.out.println("Cashier: +cashierName"); 
	System.out.println("customerName: +customerName"); 

	System.out.println ("==========================================================================================");

			// System.out.printf( %s %"ITEM",     "QTY",     "PRICE",     "TOTAL(NGN)"); 

	System.out.println("------------------------------------------------------------------------------------------"); 








	  }
	}

	


/*  

----------------------------------------------------------


3. second refinement: 

- collect inputs;

1. what is the customer's name? = Initialize variable for customerName; 


2. what did the customer purchase? = initialize variable and add to array itemPurchased;


3. how many pieces of this item did the user purchase? = initialize variable and add to array quantityPurchased; 


4. how much per unit? = initialize variable and add to array priceItems; 




5. Do you want more items?  = ( create a string variable to collect add more goods input.(AddGoodsOrStopNow = "yes"), 
while loop ==> add More Goods? = "yes" ==> 


- what did the customer purchase? = initialize variable and add to array itemPurchased; // ( use string nextLine(); to collect) 



- how many pieces of this item did the user purchase? = initialize variable and add to array quantityPurchased; // ( use int, parseint into nextLine to collect)


- how much per unit? = initialize variable and add to array priceItems; use double, pasedouble into nextLine to collect;




// 6. what are you buying next? = add to array itemPurchased; ( use int to collect) 

7. How many pieces of this item do you want to buy? = add to array quantityPurchased; 

8. how much per unit? = add to array priceItems; 

//



6. Do you want more items = ( No ) 


7. What is your name (cashier)?  variable for cashierName; 


8. How much discount will customer get? = initialize to variable (discountedAmount = subAmount / 100 x 8) 




9. 


--------------------------------------------



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

//8. invoice display (total product and qtty purchased, total amount, discount, Vat) 




--------------------------------------

checkout ecommerce; 

You have been hired to develop an ecommerce checkout system for semicolon store.

1. the store sells a variety of products, and each products has a name and a price.

2. implement a checkout system for the store that allows the cashier do the following; 

-  enter each product details in the user's cart - product and quantity purchased 
- display customer's invoice

- computes total, discount and VAT OF 7.5% total price



----------------


*/ 



