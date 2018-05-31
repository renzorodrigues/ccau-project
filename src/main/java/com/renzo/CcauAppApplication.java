package com.renzo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.renzo.domain.Atendido;
import com.renzo.repositories.AtendidoRepository;

@SpringBootApplication
public class CcauAppApplication implements CommandLineRunner {

	@Autowired
	private AtendidoRepository atendidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CcauAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		//SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY HH:mm");

		Atendido at1 = new Atendido(null, "Rodrigo", sdf.parse("10/09/2006"), sdf.parse("20/02/2016"));
		Atendido at2 = new Atendido(null, "Juliana", sdf.parse("22/02/2007"), sdf.parse("20/02/2016"));
		Atendido at3 = new Atendido(null, "Aline", sdf.parse("17/09/2005"), sdf.parse("20/02/2016"));
		Atendido at4 = new Atendido(null, "Rosa", sdf.parse("12/01/2008"), sdf.parse("20/02/2016"));
		Atendido at5 = new Atendido(null, "Samuel", sdf.parse("09/12/2006"), sdf.parse("20/02/2016"));
		Atendido at6 = new Atendido(null, "Alex", sdf.parse("04/10/2007"), sdf.parse("20/02/2016"));
		Atendido at7 = new Atendido(null, "Rodolfo", sdf.parse("11/03/2007"), sdf.parse("20/02/2016"));
		Atendido at8 = new Atendido(null, "Camila", sdf.parse("14/02/2008"), sdf.parse("20/02/2016"));
		Atendido at9 = new Atendido(null, "Moisés", sdf.parse("23/04/2006"), sdf.parse("20/02/2016"));
		Atendido at10 = new Atendido(null, "Suzane", sdf.parse("30/12/2005"), sdf.parse("20/02/2016"));
		Atendido at11 = new Atendido(null, "Nelson", sdf.parse("01/11/2007"), sdf.parse("20/02/2016"));
		Atendido at12 = new Atendido(null, "Pedrinho", sdf.parse("12/10/2006"), sdf.parse("20/02/2016"));
		Atendido at13 = new Atendido(null, "Carla", sdf.parse("08/06/2005"), sdf.parse("20/02/2016"));
		Atendido at14 = new Atendido(null, "Raquel", sdf.parse("04/03/2004"), sdf.parse("20/02/2016"));
		Atendido at15 = new Atendido(null, "Wesley", sdf.parse("11/04/2006"), sdf.parse("20/02/2016"));
		Atendido at16 = new Atendido(null, "Robson", sdf.parse("10/09/2007"), sdf.parse("20/02/2016"));
		Atendido at17 = new Atendido(null, "Marina", sdf.parse("20/01/2004"), sdf.parse("20/02/2016"));
		Atendido at18 = new Atendido(null, "Marco Aurélio", sdf.parse("13/03/2005"), sdf.parse("20/02/2016"));
		Atendido at19 = new Atendido(null, "Carlos", sdf.parse("19/10/2008"), sdf.parse("20/02/2016"));
		Atendido at20 = new Atendido(null, "Reinaldo", sdf.parse("23/12/2003"), sdf.parse("20/02/2016"));
		Atendido at21 = new Atendido(null, "Samanta", sdf.parse("30/03/2008"), sdf.parse("20/02/2016"));
		Atendido at22 = new Atendido(null, "Débora", sdf.parse("01/02/2005"), sdf.parse("20/02/2016"));
		
		atendidoRepository.saveAll(Arrays.asList(at1,at2,at3,at4,at5,at6,at7,at8,at9,at10,at11,at12,at13,at14,at15,at16,at17,at18,at19,at20,at21,at22));

	}
}
