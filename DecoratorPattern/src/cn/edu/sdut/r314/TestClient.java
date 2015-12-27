package cn.edu.sdut.r314;

public class TestClient {

	public static void main(String[] args) {
		Bread simpleBread = new SimpleBread();
		Bread sugarBread = new SugarDecorator(new SimpleBread());
		Bread eggBread = new EggDecorator(new SimpleBread());
		Bread eggAndSugarBread = new SugarDecorator(new EggDecorator(new SimpleBread()));
		System.out.println(simpleBread.bake());
		System.out.println(sugarBread.bake());
		System.out.println(eggBread.bake());
		System.out.println(eggAndSugarBread.bake());
	}
}
