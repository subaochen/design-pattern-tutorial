package cn.edu.sdut.r314;

public class TestClient {

	public static void main(String[] args) {
		Bread simpleBread = new SimpleBread();
		Bread sugarBread = new SugarDecorator(new SimpleBread());
		Bread eggBread = new EggDecorator(new SimpleBread());
		Bread eggAndSugarBread = new SugarDecorator(new EggDecorator(new SimpleBread()));
		Bread sugarAndEggBread = new EggDecorator(new SugarDecorator(new SimpleBread()));
		Bread twoEggsBread = new EggDecorator(new EggDecorator(new SimpleBread()));
		System.out.println("simpleBread:" + simpleBread.bake());
		System.out.println("sugarBread:" + sugarBread.bake());
		System.out.println("eggBread:" + eggBread.bake());
		System.out.println("eggAndSugarBread" + eggAndSugarBread.bake());
		System.out.println("sugarAndEggBread:" + sugarAndEggBread.bake());
		System.out.println("twoEggsBread:" + twoEggsBread.bake());
	}
}
