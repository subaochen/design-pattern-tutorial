package cn.edu.sdut.r314;

public class SugarDecorator extends BreadDecorator {

	private int sugar = 5;
	
	// 继续发挥wrapper作用
	public SugarDecorator(Bread breadToBeDecorated) {
		super(breadToBeDecorated);
	}
	
	@Override
	public String bake(){
		return super.bake() + " with " + sugar + "g sugar";
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
}
