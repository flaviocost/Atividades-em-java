package entites;

public class People {
	public String name;
	public int years;
	public double altura;

	public String present() {
		return "Hi, " + name;
	}

	public int happyBirthday() {
		return this.years + 1;
	}

}

