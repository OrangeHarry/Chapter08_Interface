package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;
		
		// �Ｚ ������ ��°˻�
		prn = new SPrinterDriver();
		prn.print(myDoc);
		
		// LG ������ ��� �˻�
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
//�Ｚ ������ ����̹�
class SPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer--------");
		System.out.println(doc);
	}
}
//LG ������ ����̹�
class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer--------");
		System.out.println(doc);
	}
}