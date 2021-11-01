import java.util.*;

public class assignment6 {
    public static void main(String[] args){
        
        Integer[] gas = new Integer[12];
        Integer[] internet = new Integer[12];

        Scanner keyboard = new Scanner(System.in);

        for (int i=0; i<12; i++){

            System.out.println("What is your gas bill for month " + (i+1) + ":");
            gas[i] = keyboard.nextInt();

        }
        
        System.out.println();
        System.out.println("The minimum for the gas bill was $" + getmin(gas));
        System.out.println("The maximum for the gas bill was $" + getmax(gas));
        System.out.println("The average for the gas bill was $" + getavg(gas));
        System.out.println("The amount of bills below the minimum was " + underavg(gas));
        System.out.println();
        
        for (int i=0; i<12; i++){

            System.out.println("What is your internet bill for month " + (i+1) + ":");
            internet[i] = keyboard.nextInt();
            
        }
        
        System.out.println();
        System.out.println("The minimum for the internet bill was $" + getmin(internet));
        System.out.println("The maximum for the internet was $" + getmax(internet));
        System.out.println("The average for the internet was $" + getavg(internet));
        System.out.println("The amount of bills below the minimum was " + underavg(internet));
        System.out.println();

    }

    public static int getmin(Integer[] bill){
        return Collections.min(Arrays.asList(bill));
    }
    public static int getmax(Integer[] bill){
        return Collections.max(Arrays.asList(bill));
    }
    
    public static int getavg(Integer[] bill) {
    	
    	int total = 0;
    	
    	for (int i = 0; i<12; i++) {
    		total += bill[i];
    	}
    	
    	int average = total / bill.length;
    	return average;
    }
    
    public static int underavg(Integer[] bill) {
    	int average = getavg(bill);
    	int count = 0;
    	
    	for (int i=0; i<12; i++) {
    		if(bill[i] < average) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}