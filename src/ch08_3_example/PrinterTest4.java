package ch08_3_example;

interface NewPrintable {
	void print(String doc);

	default void printCMYK(String doc) {// 자꾸 새로운 인터페이스를 만들기 귀찮으면
										// 추상메소드가 아닌 기본 메소드를 인터페이스에 만들면 되긴한다.
	}
}

//기존 흑백 프린터
class oldDriver implements NewPrintable {

	@Override
	public void print(String doc) {// 오우 기본 메소드는 무조건 재정의가 아니야~
		System.out.println("OldDriver printing");
		System.out.println(doc + "\n");
	}
}

//새로운 컬러프린터
class NewDriver implements NewPrintable {
	@Override
	public void print(String doc) {
		System.out.println("NewDriver black-white printing");
		System.out.println(doc + "\n");
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("NewDriver color printng");
		System.out.println(doc + "\n");
	}
}

public class PrinterTest4 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		NewPrintable prn;
		prn = new oldDriver();
		prn.print(myDoc);

		prn = new NewDriver();
		prn.print(myDoc);
		prn.printCMYK(myDoc);
	}
}
