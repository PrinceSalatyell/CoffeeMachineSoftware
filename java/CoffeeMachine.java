import java.util.Scanner;

public class CoffeeMachine {
    
    public static final int WATER_PER_CUP_ESPRESSO = 250;
    public static final int MILK_PER_CUP_ESPRESSO = 0;
    public static final int COFFEE_BEANS_PER_CUP_ESPRESSO = 16;
    public static final int MONEY_PER_CUP_ESPRESSO = 4;
    
    public static final int WATER_PER_CUP_LATTE = 350;
    public static final int MILK_PER_CUP_LATTE = 75;
    public static final int COFFEE_BEANS_PER_CUP_LATTE = 20;
    public static final int MONEY_PER_CUP_LATTE = 7;
    
    public static final int WATER_PER_CUP_CAPPUCCINO = 200;
    public static final int MILK_PER_CUP_CAPPUCCINO = 100;
    public static final int COFFEE_BEANS_PER_CUP_CAPPUCCINO = 12;
    public static final int MONEY_PER_CUP_CAPPUCCINO = 6;
    
    public static int water = 400;
    public static int milk = 540;		
    public static int coffeeBeans = 120;
    public static int cups = 9;
    public static int money = 550;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String word;
        
        while(true) {
        	System.out.println("Write action (buy, fill, take, remaining, exit):");
        	word = scanner.next();
	        switch (word) {
	            case "fill":
	            	fill(scanner);
	            	continue;
	            case "take":
	            	take();
	            	continue;
	            case "buy":
	            	buy(scanner);
	            	continue;
	            case "remaining":
	            	machineState();
	            	continue;
	            default:
	            	return;
	        }
        }
    }
    
    public static void machineState() {
    	System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d "
    			+ "disposable cups \n$%d of money\n\n", water, milk, coffeeBeans, cups, money);
    }
    
    public static void fill(Scanner scanner) {
    	System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += scanner.nextInt();
    }
    
    public static void take() {
    	System.out.printf("I gave you $%d\n\n", money);
    	money = 0;
    }
    
    public static void buy(Scanner scanner) {
    	System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
    	String x = scanner.next();
    	
    	switch (x) {
    	    case "1":
    	    	if (water - WATER_PER_CUP_ESPRESSO < 0) {
    	    		System.out.println("Sorry, not enough water!\n");
    	    		return;
    	    	} else if (coffeeBeans - COFFEE_BEANS_PER_CUP_ESPRESSO < 0) {
    	    		System.out.println("Sorry, not enough coffee beans!\n");
    	    		return;
    	    	} else if (cups - 1 < 0) {
    	    		System.out.println("Sorry, not enough cups!\n");
    	    		return;
    	    	} else {
    	    		System.out.println("I have enough resources, making you a coffee!");
	    	    	water -= WATER_PER_CUP_ESPRESSO;
	    	    	coffeeBeans -= COFFEE_BEANS_PER_CUP_ESPRESSO;
	    	    	cups--;
	    	    	money += MONEY_PER_CUP_ESPRESSO;
	    	    	break;
    	    	}	
    	    case "2":
    	    	if (water - WATER_PER_CUP_LATTE < 0) {
    	    		System.out.println("Sorry, not enough water!\n");
    	    		return;
    	    	} else if (milk - MILK_PER_CUP_LATTE < 0) {
    	    		System.out.println("Sorry, not enough milk!\n");
    	    		return;
    	    	} else if (coffeeBeans - COFFEE_BEANS_PER_CUP_LATTE < 0) {
    	    		System.out.println("Sorry, not enough coffee beans!\n");
    	    		return;
    	    	} else if (cups - 1 < 0) {
    	    		System.out.println("Sorry, not enough cups!\n");
    	    		return;
    	    	} else {
    	    		System.out.println("I have enough resources, making you a coffee!");
	    	    	water -= WATER_PER_CUP_LATTE;
	    	    	milk -= MILK_PER_CUP_LATTE;
	    	    	coffeeBeans -= COFFEE_BEANS_PER_CUP_LATTE;
	    	    	cups--;
	    	    	money += MONEY_PER_CUP_LATTE;
	    	    	break;
    	    	}	
    	    case "3":
    	    	if (water - WATER_PER_CUP_CAPPUCCINO < 0) {
    	    		System.out.println("Sorry, not enough water!\n");
    	    		return;
    	    	} else if (milk - MILK_PER_CUP_CAPPUCCINO < 0) {
    	    		System.out.println("Sorry, not enough milk!\n");
    	    		return;
    	    	} else if (coffeeBeans - COFFEE_BEANS_PER_CUP_CAPPUCCINO < 0) {
    	    		System.out.println("Sorry, not enough coffee beans!\n");
    	    		return;
    	    	} else if (cups - 1 < 0) {
    	    		System.out.println("Sorry, not enough cups!\n");
    	    		return;
    	    	} else {
    	    		System.out.println("I have enough resources, making you a coffee!");
	    	    	water -= WATER_PER_CUP_CAPPUCCINO;
	    	    	milk -= MILK_PER_CUP_CAPPUCCINO;
	    	    	coffeeBeans -= COFFEE_BEANS_PER_CUP_CAPPUCCINO;
	    	    	cups--;
	    	    	money += MONEY_PER_CUP_CAPPUCCINO;
	    	    	break;
    	    	}	
    	    default:
    	    	System.out.println();
    	    	return;
    	}
    	System.out.println();
    }
}
