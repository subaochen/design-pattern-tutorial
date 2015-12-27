package cn.edu.sdut.r314;

public abstract class BreadDecorator implements Bread {
	protected Bread breadToBeDecorated;
	
	public BreadDecorator(Bread breadToBeDecorated) {
		this.breadToBeDecorated = breadToBeDecorated;
	}

	@Override
	public String bake() {
		return breadToBeDecorated.bake();
	}

}
