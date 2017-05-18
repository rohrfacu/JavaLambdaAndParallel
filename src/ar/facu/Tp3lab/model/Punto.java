package ar.facu.Tp3lab.model;

public class Punto {
	double x;
	double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Punto()
	{
		
	}
	
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x+";"+y;
	}
}
