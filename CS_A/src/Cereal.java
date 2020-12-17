public class Cereal {
	private String name = "", type = "";
	private int calories = 0, protein= 0, fat= 0, sodium= 0,fiber= 0,carbs= 0,sugar= 0,potasium= 0,vitamins= 0, shelf= 0;
	private double weight = 0,cups= 0, rating= 0;

	public Cereal(String name, String type, int calories, int protein, int fat, int sodium, int fiber, int carbs, int sugar, int potasium, int vitamins, int shelf, double weight, double cups, double rating) {
		this.name = name;
		this.type = type;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.sodium = sodium;
		this.fiber = fiber;
		this.carbs = carbs;
		this.sugar = sugar;
		this.potasium = potasium;
		this.vitamins = vitamins;
		this.shelf = shelf;
		this.weight = weight;
		this.cups = cups;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getCalories() {
		return calories;
	}

	public int getProtein() {
		return protein;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getFiber() {
		return fiber;
	}

	public int getCarbs() {
		return carbs;
	}

	public int getSugar() {
		return sugar;
	}

	public int getPotasium() {
		return potasium;
	}

	public int getVitamins() {
		return vitamins;
	}

	public int getShelf() {
		return shelf;
	}

	public double getWeight() {
		return weight;
	}

	public double getCups() {
		return cups;
	}

	public double getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setFiber(int fiber) {
		this.fiber = fiber;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setPotasium(int potasium) {
		this.potasium = potasium;
	}

	public void setVitamins(int vitamins) {
		this.vitamins = vitamins;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setCups(double cups) {
		this.cups = cups;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Cereal{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", calories=" + calories +
				", protein=" + protein +
				", fat=" + fat +
				", sodium=" + sodium +
				", fiber=" + fiber +
				", carbs=" + carbs +
				", sugar=" + sugar +
				", potasium=" + potasium +
				", vitamins=" + vitamins +
				", shelf=" + shelf +
				", weight=" + weight +
				", cups=" + cups +
				", rating=" + rating +
				'}';
	}
}