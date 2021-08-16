package ch08_2_polymorphism;

public interface DataAccessObject {
	public abstract void select();
	void insert();
	void update();
	void delete();
}
