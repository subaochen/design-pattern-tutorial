package cn.edu.sdut.r314;

public class PaintedDecorator extends RoomDecorator {

	public PaintedDecorator(Room roomToBeDecorated) {
		super(roomToBeDecorated);
	}
	
	public String showRoom(){
		doPainting();
		return super.showRoom() + "刷墙漆"; 
	}
	
	// 刷墙漆
	private void doPainting(){}
}
