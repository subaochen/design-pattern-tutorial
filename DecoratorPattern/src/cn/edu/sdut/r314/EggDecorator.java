package cn.edu.sdut.r314;

public class EggDecorator extends BreadDecorator {
	private int egg = 1;

	public EggDecorator(Bread breadToBeDecorated) {
		super(breadToBeDecorated);
	}
	
	@Override
	public String bake(){
		return super.bake() + " with " + egg + " egg";
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	}
	
	

}
