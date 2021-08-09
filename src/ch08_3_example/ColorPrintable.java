package ch08_3_example;

public interface ColorPrintable extends Printable { 
	// 새로 추가되는 기능이라 기존 인터페이스에 메소드 추가가 아닌
	// 새로운 메소드를 만들어서 필요한 애들이 가져다 쓰는게 맞다.
	// 그러고 상속하면 되징
	abstract void printCMYK(String doc); //4색출력
}
