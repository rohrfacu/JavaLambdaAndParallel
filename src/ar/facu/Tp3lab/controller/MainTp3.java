package ar.facu.Tp3lab.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ar.facu.Tp3lab.model.PointFactory;
import ar.facu.Tp3lab.model.Punto;
import ar.facu.Tp3lab.model.Solucion;

public class MainTp3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		PointFactory fabrica = new PointFactory();
		fabrica.fillList(50000000);
		Solucion s = new Solucion();
		Punto centroide = s.puntoC(fabrica.getPuntos());
		//--------------PUNTO A------------//
		System.out.println("Punto A");
		s.puntoA(fabrica.getPuntos()).stream().forEach(System.out::println);
		//--------------PUNTO B------------//
		System.out.println("Punto B");
		s.puntoB(fabrica.getPuntos()).stream().forEach(System.out::println);
		//--------------PUNTO C------------//
		System.out.println("Punto C");
		System.out.println(s.puntoC(fabrica.getPuntos()));
		//--------------PUNTO D------------//
		System.out.println("Punto D");
		s.puntoD(fabrica.getPuntos(), centroide).stream().forEach(System.out::println);
		//--------------PUNTO E------------//
		System.out.println("Punto E");
		System.out.println("Sin parallel");
		System.out.println("Start at: "+ LocalDateTime.now().format(formatter));
		System.out.println("Grado de densidad: "+ s.puntoE(fabrica.getPuntos(), centroide));
		System.out.println("Finish at: "+ LocalDateTime.now().format(formatter));
		//--------------PUNTO F------------//
		System.out.println("Punto F");
		System.out.println("Con parallel");
		System.out.println("Start at: "+ LocalDateTime.now().format(formatter));
		System.out.println("Grado 2 de densidad: "+ s.puntoF(fabrica.getPuntos(), centroide));
		System.out.println("Finish at: "+ LocalDateTime.now().format(formatter));
	}

}
