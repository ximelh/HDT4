/******************************************************************
 Ultima modificacion: 19/02/2022

 Clase para probar la calculadora, los stack y las listas
 @file CalculadoraGrupo10Test.java

 ******************************************************************/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraGrupo10Test {
	
	/**
	 * Evalua el metodo de calculate para vectores
	 * @throws Exception 
	 */
	@Test
	void testCalculateVector() throws Exception {
		CalculadoraGrupo10 calculadora = CalculadoraGrupo10.getInstance();
		try {
			assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +","VE",""),0.001,"Error en Calculate");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		assertEquals(30,calculadora.calculate("6 2 3 + *","VE",""),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +","VE",""),0.001,"Error en Calculate");
	}
	
	/**
	 * Evalua el metodo de calculate para arraylist
	 * @throws Exception 
	 */
	@Test
	void testCalculateArrayList() throws Exception {
		CalculadoraGrupo10 calculadora = CalculadoraGrupo10.getInstance();
		try {
			assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +","AL",""),0.001,"Error en Calculate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(30,calculadora.calculate("6 2 3 + *","AL",""),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +","AL",""),0.001,"Error en Calculate");
	}
	
	/**
	 * Evalua el metodo de calculate para listas simplemente encadenadas
	 * @throws Exception 
	 */
	@Test
	void testCalculateSimpleList() throws Exception {
		CalculadoraGrupo10 calculadora = CalculadoraGrupo10.getInstance();
		try {
			assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +","LI","S"),0.001,"Error en Calculate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(30,calculadora.calculate("6 2 3 + *","LI","S"),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +","LI","S"),0.001,"Error en Calculate");
	}
	
	
	/**
	 * Evalua el metodo de calculate para listas doblemente encadenadas
	 * @throws Exception 
	 */
	@Test
	void testCalculateDoubleList() throws Exception {
		CalculadoraGrupo10 calculadora = CalculadoraGrupo10.getInstance();
		try {
			assertEquals(15,calculadora.calculate("1 2 + 4 * 3 +","LI","D"),0.001,"Error en Calculate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(30,calculadora.calculate("6 2 3 + *","LI","D"),0.001,"Error en Calculate");
		assertEquals(11,calculadora.calculate("10 3 5 + - 2 + 3 * 4 5 - +","LI","D"),0.001,"Error en Calculate");
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del stack de vectores
	 */
	@Test
	void testAddRemoveVector() {
		StackFactory<Double> stackF = new StackFactory<Double>();
        Stack<Double> stack = stackF.getStack("VE","");
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.peek(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.size(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.remove(),0.001,"Error al quitar elemento del stack");
		assertEquals(1,stack.remove(),0.001,"Error al quitar elemento del stack");
		
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del stack de arraylist
	 */
	@Test
	void testAddRemoveArray() {
		StackFactory<Double> stackF = new StackFactory<Double>();
        Stack<Double> stack = stackF.getStack("AL","");
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.peek(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.size(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.remove(),0.001,"Error al quitar elemento del stack");
		assertEquals(1,stack.remove(),0.001,"Error al quitar elemento del stack");
		
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del stack de lista simplemente encadenada
	 */
	@Test
	void testAddRemoveSimple() {
		StackFactory<Double> stackF = new StackFactory<Double>();
        Stack<Double> stack = stackF.getStack("LI","S");
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.peek(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.size(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.remove(),0.001,"Error al quitar elemento del stack");
		assertEquals(1,stack.remove(),0.001,"Error al quitar elemento del stack");
		
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del stack de lista doblemente encadenada
	 */
	@Test
	void testAddRemoveDouble() {
		StackFactory<Double> stackF = new StackFactory<Double>();
        Stack<Double> stack = stackF.getStack("LI","D");
		stack.add(1.0);
		stack.add(2.0);
		assertEquals(2,stack.peek(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.size(),0.001,"Error al obtener objeto del stack");
		assertEquals(2,stack.remove(),0.001,"Error al quitar elemento del stack");
		assertEquals(1,stack.remove(),0.001,"Error al quitar elemento del stack");
		
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del una lista simplemente encadenada
	 */
	@Test
	void testSimpleList() {
		ListFactory<Double> listF = new ListFactory<Double>();
		LinkedList<Double> list = listF.getList("S");
		list.insertLink(1.0);
		list.insertLink(4.0);
		list.insertLink(9.0);
		list.insertLink(5.0);
		assertEquals(4,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(5,list.getFirstObj(),0.001,"Error al obtener primer objeto de la lista");
		assertEquals(5,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(3,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(9,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(2,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(4,list.getFirstObj(),0.001,"Error al obtener primer objeto de la lista");
		assertEquals(4,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(1,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(1,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(0,list.getSize(),0.001,"Error al obtener largo de la lista");
	}
	
	/**
	 * Evalua agregar, quitar y ver elementos del una lista doblemente encadenada
	 */
	@Test
	void testDoubleList() {
		ListFactory<Double> listF = new ListFactory<Double>();
		LinkedList<Double> list = listF.getList("D");
		list.insertLink(1.0);
		list.insertLink(4.0);
		list.insertLink(9.0);
		list.insertLink(5.0);
		assertEquals(4,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(5,list.getFirstObj(),0.001,"Error al obtener primer objeto de la lista");
		assertEquals(5,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(3,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(9,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(2,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(4,list.getFirstObj(),0.001,"Error al obtener primer objeto de la lista");
		assertEquals(4,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(1,list.getSize(),0.001,"Error al obtener largo de la lista");
		assertEquals(1,list.removeFirst(),0.001,"Error al quitar primer objeto de la lista");
		assertEquals(0,list.getSize(),0.001,"Error al obtener largo de la lista");
	}

}
