package Visitor_singer;

public class Man extends Person {

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManResult(this);
	}

}
