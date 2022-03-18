package ec.edu.uce;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.modelo.PolizaSeguro;
import ec.edu.uce.service.IPolizaSeguroServi;

@SpringBootTest
class PolizaSeguroTest {

	@Autowired
	private IPolizaSeguroServi polizaSeguroServi;
	
	@BeforeEach
	void testInsertarPolizaSeguro() {
		PolizaSeguro poliza = new PolizaSeguro();
		poliza.setId(3);
		poliza.setNumero("123");
		poliza.setValor(new BigDecimal("100"));
		poliza.setDescripcion("Descripcion 1");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.now());
		poliza.setEstado("Vigente");
		assertTrue(this.polizaSeguroServi.insertarPolizaSeguro(poliza));
		//assertNotNull(this.polizaSeguroServi.buscarPolizaSeguro(1));
	}
	
	@Test
	void testBuscarPolizaSeguro() {
		assertNotNull(this.polizaSeguroServi.buscarPolizaSeguro(1));
	}
	
	@Test
	void testActualizarPolizaSeguro() {
		PolizaSeguro actualizar = this.polizaSeguroServi.buscarPolizaSeguro(1);
		actualizar.setNumero("333");
		this.polizaSeguroServi.actualizarPolizaSeguro(actualizar);
		assertEquals(this.polizaSeguroServi.buscarPolizaSeguro(1).getNumero(), "333");
	}
	
	@AfterEach
	void testBorrarPolizaSeguro() {
		this.polizaSeguroServi.borrarPolizaSeguro(3);
		assertEquals(this.polizaSeguroServi.buscarPolizaSeguro(3), null);
	}
	
	@BeforeEach
	void testInsertarPolizaSeguro2() {
		PolizaSeguro poliza = new PolizaSeguro();
		poliza.setId(4);
		poliza.setNumero("456");
		poliza.setValor(new BigDecimal("200"));
		poliza.setDescripcion("Descripcion 2");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.now());
		poliza.setEstado("Vigente");
		assertTrue(this.polizaSeguroServi.insertarPolizaSeguro(poliza));
		//assertNotNull(this.polizaSeguroServi.buscarPolizaSeguro(1));
	}
	
	@Test
	void testBuscarPolizaSeguro2() {
		assertNotNull(this.polizaSeguroServi.buscarPolizaSeguro(2));
	}
	
	@Test
	void testActualizarPolizaSeguro2() {
		PolizaSeguro actualizar = this.polizaSeguroServi.buscarPolizaSeguro(2);
		actualizar.setNumero("444");
		this.polizaSeguroServi.actualizarPolizaSeguro(actualizar);
		assertEquals(this.polizaSeguroServi.buscarPolizaSeguro(2).getNumero(), "444");
	}
	
	@AfterEach
	void testBorrarPolizaSeguro2() {
		this.polizaSeguroServi.borrarPolizaSeguro(4);
		assertEquals(this.polizaSeguroServi.buscarPolizaSeguro(4), null);
	}
}
