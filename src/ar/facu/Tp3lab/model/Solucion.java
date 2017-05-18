package ar.facu.Tp3lab.model;

import java.util.List;
import java.util.stream.Collectors;

public class Solucion {


	public List<Punto> puntoA(List<Punto> lista)
	{
		List<Punto> listaLambda = lista.stream()
					.sorted((p1,p2) -> Double.compare(p1.getX(), p2.getX()))
					.map(p -> {
						Punto pfx = new Punto(p.getX(), (p.getX()*p.getX() - 4*p.getX() +3));
						return pfx;
					})
					.collect(Collectors.toList());
		return listaLambda;
	}
	
	public List<Punto> puntoB(List<Punto> lista)
	{
		List<Punto> listaDif = lista.stream()
				.sorted((p1,p2) -> Double.compare(p1.getX(), p2.getX()))
				.filter(p -> {
					double x = p.getX();
					return Math.abs(x - (x*x - 4*x +3)) < 10;
				}).collect(Collectors.toList());
		return listaDif;
	}
	
	public Punto puntoC(List<Punto> lista)
	{
		double x = lista.stream().collect(Collectors.averagingDouble(p -> p.getX()));
		double y = lista.stream().collect(Collectors.averagingDouble(p -> p.getY()));
		Punto p = new Punto(x,y);
		return p;
	}
	
	public List<Punto> puntoD(List<Punto> lista, Punto centroide)
	{
		double x2 = centroide.getX();
		double y2 = centroide.getY();
		List<Punto> listaEuc = lista.stream()
				.filter(p -> {
					double x1 = p.getX();
					double y1 = p.getY();
					double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
					return dist < 10;
				}).collect(Collectors.toList());
				
		return listaEuc;
	}
	
	public double puntoE(List<Punto> lista, Punto centroide)
	{
		double x2 = centroide.getX();
		double y2 = centroide.getY();
		double promedio = lista.stream()
				.map(p -> {
					double x1 = p.getX();
					double y1 = p.getY();
					return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
				}).collect(Collectors.averagingDouble(p -> p ));
		double G = 70 - promedio;
		return G;
	}
	
	public double puntoF(List<Punto> lista, Punto centroide)
	{
		double x2 = centroide.getX();
		double y2 = centroide.getY();
		double promedio = lista.stream().parallel()
				.map(p -> {
					double x1 = p.getX();
					double y1 = p.getY();
					return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
				}).collect(Collectors.averagingDouble(p -> p ));
		double G = 70 - promedio;
		return G;
	}
	
}
