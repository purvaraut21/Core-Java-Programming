package Exercise_4;

import java.util.Scanner;

public class Q5_MealSuggestions {
	/*5. Switch Case for Meal Suggestions
 		 Create a program that suggests meals based on dietary preferences.
			Use a switch statement to suggest:
			1: "Vegetarian: Grilled Vegetable Salad"
			2: "Vegan: Quinoa and Black Bean Bowl"
			3: "Gluten-Free: Grilled Chicken with Rice"
			4: "Keto: Zucchini Noodles with Pesto"
			If the number is not between 1 and 4, print "Invalid dietary preference."
	 * 
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your dietary preference (1-4): ");
        int dietaryPreference = scanner.nextInt();

        switch (dietaryPreference) {
            case 1:
                System.out.println("Vegetarian: Grilled Vegetable Salad");
                break;
            case 2:
                System.out.println("Vegan: Quinoa and Black Bean Bowl");
                break;
            case 3:
                System.out.println("Gluten-Free: Grilled Chicken with Rice");
                break;
            case 4:
                System.out.println("Keto: Zucchini Noodles with Pesto");
                break;
            default:
                System.out.println("Invalid dietary preference.");
        }

        scanner.close();
    }
}
