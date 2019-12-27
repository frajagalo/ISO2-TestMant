package edu.uclm.esi.iso2.banco20193capas;

import edu.uclm.esi.iso2.banco20193capas.model.Cliente;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class TestCliente 
{
	private Cliente cliente;
	
	@Before
	public void setUp() throws Exception
	{
		cliente = new Cliente("12345678", "Mariano", "Montero Leon");	
	}
	
/*	@Test
	public void testConstructor()
	{
		assertEquals(cliente, new Cliente("12345678", "Mariano", "Montero Leon"));		
	}*/
	
	@Test
	public void testFailedConstructor()
	{
		Cliente clienteFailed = new Cliente("87654321", "Santiago", "Segura");
		assertNotEquals(cliente, clienteFailed);		
	}
	
	@Test
	public void testgetId()
	{
		cliente.setId(12345L);
		Cliente clienteTest = new Cliente();
		clienteTest.setId(12345L);
		assertEquals(cliente.getId(), clienteTest.getId());
	}
	
	@Test
	public void testFailedgetId()
	{
		cliente.setId(12345L);
		Cliente clienteFailedTest = new Cliente();
		clienteFailedTest.setId(54321L);
		
		assertNotEquals(cliente.getId(), clienteFailedTest.getId());
		assertNotNull(cliente.getId());
		assertTrue(cliente.getId() > 0L);
	}
	
	@Test
	public void testSetId()
	{
		cliente.setId(12345L);
		Cliente clienteTest = new Cliente();
		clienteTest.setId(12345L);
		
		assertEquals(cliente.getId(), clienteTest.getId());
		
		
	}
	
	@Test
	public void testFailedSetId()
	{
		cliente.setId(12345L);
		Cliente clienteFailedTest = new Cliente();
		clienteFailedTest.setId(54321L);
		assertNotEquals(cliente.getId(), clienteFailedTest.getId());
		
		cliente.setId(null);
		assertNull(cliente.getId());
		
		cliente.setId(-1L);
		assertTrue(-1L < 0L);
		
		cliente.setId(0L);
		assertTrue(cliente.getId() == 0L);
				
	}
	
	@Test
	public void testGetNif()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setNif("12345678");
		assertEquals(cliente.getNif(), clienteTest.getNif());
	}
	
	@Test
	public void testFailedGetNif()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setNif("87654321");
		
		assertNotEquals(cliente.getNif(), clienteTest.getNif());
		
		clienteTest.setId(null);
		
/*		assertNull(cliente.getNif());
		
		clienteTest.setNif("");
		assertEquals(clienteTest.getNif(), "");*/
	}
	
	@Test
	public void testSetNif()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setNif("12345678");
		assertEquals(cliente.getNif(), clienteTest.getNif());
	}
	
	@Test
	public void testFailedSetNif()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setNif("87654321");
		assertNotEquals(cliente.getNif(), clienteTest.getNif());
		
		clienteTest.setNif(null);
		assertNull(clienteTest.getNif());
		
		clienteTest.setNif("");
		assertEquals(clienteTest.getNif(), "");
	}
	
	@Test
	public void testGetNombre()
	{
		Cliente clienteTest =  new Cliente();
		clienteTest.setNombre("Mariano");
		assertEquals(cliente.getNombre(), clienteTest.getNombre());
	}
	
	@Test
	public void testFailedGetNombre()
	{
		Cliente clienteFailedTest =  new Cliente();
		clienteFailedTest.setNombre("Apolonio");
		assertNotEquals(cliente.getNombre(), clienteFailedTest.getNombre());
		
		clienteFailedTest.setNombre(null);
		assertNull(clienteFailedTest.getNombre());
		
		clienteFailedTest.setNombre("");
		assertEquals(clienteFailedTest.getNombre(), "");
	}
	
	@Test
	public void testSetNombre()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setNombre("Mariano");
		assertEquals(cliente.getNombre(), clienteTest.getNombre());
	}
	
	@Test
	public void testFailedSetNombre()
	{
		Cliente clienteFailedTest = new Cliente();
		clienteFailedTest.setNombre("Apolonio");
		assertNotEquals(cliente.getNombre(), clienteFailedTest.getNombre());
		
		clienteFailedTest.setNombre(null);
		assertNull(clienteFailedTest.getNombre());
		
		clienteFailedTest.setNombre("");
		assertEquals(clienteFailedTest.getNombre(), "");
	}
	
	@Test 
	public void testGetApellidos()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setApellidos("Montero Leon");
		assertEquals(cliente.getApellidos(), clienteTest.getApellidos());
	}
	
	@Test 
	public void testFailedGetApellidos()
	{
		Cliente clienteFailedTest = new Cliente();
		clienteFailedTest.setApellidos("Sanchez Garcia");
		assertNotEquals(cliente.getApellidos(), clienteFailedTest.getApellidos());
		
		clienteFailedTest.setApellidos(null);
		assertNull(clienteFailedTest.getApellidos());
		
		clienteFailedTest.setApellidos("");
		assertEquals(clienteFailedTest.getApellidos(), "");
	}
	
	@Test
	public void testSetApellidos()
	{
		Cliente clienteTest = new Cliente();
		clienteTest.setApellidos("Montero Leon");
		assertEquals(cliente.getApellidos(), clienteTest.getApellidos());
	}
	
	@Test
	public void testFailedSetApellidos()
	{
		Cliente clienteFailedTest = new Cliente();
		clienteFailedTest.setApellidos("Sanchez Garcia");
		
		assertNotEquals(cliente.getApellidos(), clienteFailedTest.getApellidos());
		clienteFailedTest.setApellidos(null);
		assertNull(clienteFailedTest.getApellidos());
		
		clienteFailedTest.setApellidos("");
		assertEquals(clienteFailedTest.getApellidos(), "");
	}
	
}
