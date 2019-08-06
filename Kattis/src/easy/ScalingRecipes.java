package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScalingRecipes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String recipes = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(recipes); i++){
			int numIngredients = sc.nextInt();
			List<Ingredient> ingredients = new ArrayList<Ingredient>();
			int recipePers = sc.nextInt();
			int desirePers = sc.nextInt();
			sc.nextLine();
			double mainIngG = 0.0;
			System.out.println("Recipe # " + (i + 1));
			for (int j = 0; j < numIngredients; j++){
				String[] ingr = sc.nextLine().split(" ");
				String name = ingr[0];
				double weight = Double.parseDouble(ingr[1]);
				double percentage = Double.parseDouble(ingr[2]);
				if (percentage == 100)
					mainIngG = weight * ((double)desirePers / recipePers);
				ingredients.add(new Ingredient(name, weight, percentage));
			}
			for (int j = 0; j < numIngredients; j++){
				Ingredient ing = ingredients.get(j);
				System.out.println(ing.name + " " + mainIngG * ing.percentage / 100);
			}
			System.out.println("----------------------------------------");
		}
	}
}

class Ingredient{
	String name;
	double weight;
	double percentage;
	
	public Ingredient(String name, double weight, double percentage){
		this.name = name;
		this.weight = weight;
		this.percentage = percentage;
	}
}
