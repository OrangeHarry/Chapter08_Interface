package ch08_3_example;

public interface ColorPrintable extends Printable { 
	// ���� �߰��Ǵ� ����̶� ���� �������̽��� �޼ҵ� �߰��� �ƴ�
	// ���ο� �޼ҵ带 ���� �ʿ��� �ֵ��� ������ ���°� �´�.
	// �׷��� ����ϸ� ��¡
	abstract void printCMYK(String doc); //4�����
}
