package basic_project;

public class Operator {
	int value=10;
	public  void operand(Operator op) {
		op.value+=50;
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator op = new Operator();
		System.out.println(op.value);
		op.operand(op);
		
		

	}

}
