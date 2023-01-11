package chapter05;

public class FuncTest_OverloadingMain {
	public static void main(String[] args) {	
		var func = new FuncTest_Overloading();
		func.getResult('A');
		func.getResult(10);
		func.getResult("aa");
		func.getResult(6, "2023");
	}
}
