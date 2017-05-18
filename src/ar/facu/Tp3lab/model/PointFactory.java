package ar.facu.Tp3lab.model;

import java.util.ArrayList;
import java.util.List;

public class PointFactory {
	
	private List<Punto> puntos;
	
	public PointFactory()
	{
		this.puntos = new ArrayList<Punto>();
	}

	public List<Punto> getPuntos() {
		return puntos;
	}
	
	public void fillList(int limit)
	{
		GeneradorRandom gen = new GeneradorRandom();
		for(int i = 0; i <limit; i++)
		{
			double x = gen.Generar(-10, 10);
			double y = gen.Generar(-10, 10);
			Punto punto = new Punto(x,y);
			puntos.add(punto);
		}
	}
	
	public void printList()
	{
		puntos.forEach(a -> {System.out.println(a.getX() +";"+a.getY());});
	}
	
}
