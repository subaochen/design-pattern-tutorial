package cn.edu.sdut.r314;

public class FlooredDecorator extends RoomDecorator {

	public FlooredDecorator(Room roomToBeDecorated) {
		super(roomToBeDecorated);
	}
	
	public String showRoom(){
		doFlooring();
		return super.showRoom() + "铺地板";
	}
	
	// 铺地板
	private void doFlooring(){}
}
