package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.PolizaSeguro;
import ec.edu.uce.service.IPolizaSeguroServi;

@SpringBootApplication
public class Tarea27PruebasUnitariasNc1Application implements CommandLineRunner {

	@Autowired
	private IPolizaSeguroServi polizaSeguroServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea27PruebasUnitariasNc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		PolizaSeguro poliza = new PolizaSeguro();
		poliza.setId(1);
		poliza.setNumero("123");
		poliza.setValor(new BigDecimal("100"));
		poliza.setDescripcion("Descripcion 1");
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.now());
		poliza.setEstado("Vigente");
		this.polizaSeguroServi.actualizarPolizaSeguro(poliza);
		
		PolizaSeguro poliza2 = new PolizaSeguro();
		poliza2.setId(2);
		poliza2.setNumero("456");
		poliza2.setValor(new BigDecimal("200"));
		poliza2.setDescripcion("Descripcion 2");
		poliza2.setFechaEmision(LocalDateTime.now());
		poliza2.setFechaVigencia(LocalDateTime.now());
		poliza2.setEstado("Vigente");
		this.polizaSeguroServi.actualizarPolizaSeguro(poliza2);;
		
	}

}
