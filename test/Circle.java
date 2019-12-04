package test;

public class Circle implements CalcArea{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
