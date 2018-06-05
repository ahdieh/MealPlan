/*
 * a program that includes both, call by value and call by reference. 
 * This program computes the total meal plan cost for a semester. The main 
 * method calls four methods:
 *  1- getTotalMealWeeks 
 *  2- getDailyMealCost
 *  3- compute the MealPlanCost
 *  4- print the TotalMealPlan cost
 */
package mealplan;
import java.util.Arrays;
import java.util.Scanner;

/**
 * * @author ahdieh
 */
public class MealPlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalWeeks = getTotalMealWeeks();
        double[] dailyCost = new double[7];
        
        System.out.println("Before the method" + Arrays.toString(dailyCost));
        getDailyMealCost(dailyCost);
        System.out.println("After the method" + Arrays.toString(dailyCost));
        double totalCost = computeMealPlanCost(dailyCost, totalWeeks);
        printTotalMealPlanCost(totalCost);
    }
    
    
    public static int getTotalMealWeeks(){
        int totalWeeks;
        Scanner in = new Scanner(System.in);
        System.out.print("How many weeks are in your semester? ");
        totalWeeks = in.nextInt();
        return totalWeeks;
    }
    
    public static void getDailyMealCost(double[] dailyCost){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < dailyCost.length; i++){
           System.out.printf("Enter the estimated cost for the day %d: " , (i+1));
           dailyCost[i] = in.nextDouble();
        }
    }
    
    public static double computeMealPlanCost(double[] dailyCost, int totalWeeks){
	double weeklyCost = 0, totalCost = 0;
	for (int i =0; i < dailyCost.length; i++){
            weeklyCost += dailyCost[i];
	}
	totalCost = totalWeeks * weeklyCost;
	return totalCost;
    }

    public static void printTotalMealPlanCost(double totalCost){
    	System.out.printf("the total meal plan cost is: $%5.2f", totalCost);
	System.out.println();
    }
}
