package cn.edu.sdut.r314;

// 禁止直接使用没有任何修饰作用的Decorator基类，因此这里的BreadDecorator为abstract类
public abstract class BreadDecorator implements Bread {
	// 关键环节，被修饰的bread对象，decorator模式的wrapper作用就体现在这里
	// 也参见构造方法和TestClient如何构造不同的Bread对象
	protected Bread breadToBeDecorated;
	
	public BreadDecorator(Bread breadToBeDecorated) {
		this.breadToBeDecorated = breadToBeDecorated;
	}

	@Override
	public String bake() {
		// 委托给被修饰的bread对象
		return breadToBeDecorated.bake();
	}

}
