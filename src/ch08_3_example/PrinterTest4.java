package ch08_3_example;

interface NewPrintable {
	void print(String doc);

	default void printCMYK(String doc) {// �ڲ� ���ο� �������̽��� ����� ��������
										// �߻�޼ҵ尡 �ƴ� �⺻ �޼ҵ带 �������̽��� ����� �Ǳ��Ѵ�.
	}
}

//���� ��� ������
class oldDriver implements NewPrintable {

	@Override
	public void print(String doc) {// ���� �⺻ �޼ҵ�� ������ �����ǰ� �ƴϾ�~
		System.out.println("OldDriver printing");
		System.out.println(doc + "\n");
	}
}

//���ο� �÷�������
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
