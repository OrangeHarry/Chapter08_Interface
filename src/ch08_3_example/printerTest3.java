package ch08_3_example;

// 새로운(컬러) 프린터 등장~~
class SP9600CDriver implements ColorPrintable {
	@Override
	public void printCMYK(String doc) {
		System.out.println("Samsung SP9600CDriver color printing");
		System.out.println(doc + "\n");
	}

	@Override
	public void print(String doc) {
		System.out.println("Samsung SP9600CDriver black-white printing");
		System.out.println(doc + "\n");
	}
}

public class printerTest3 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		ColorPrintable prn = new SP9600CDriver();
		prn.print(myDoc);
		prn.printCMYK(myDoc);
	}
}
