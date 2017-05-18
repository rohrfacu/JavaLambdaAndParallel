package ar.facu.Tp3lab.model;

import java.util.Random;

public class GeneradorRandom {
	
	public double Generar(double min, double max)
	{
		Random rand = new Random();
		double valor = min + (max - min)*rand.nextDouble();
		return valor;
	}
}
