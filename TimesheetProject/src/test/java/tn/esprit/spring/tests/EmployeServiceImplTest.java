package tn.esprit.spring.tests;

import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class EmployeServiceImplTest {

	public static final Logger log = LogManager.getLogger(EmployeServiceImplTest.class);
	
	@Before
	public void setUp() {
		
//		em = new Employe("Tchea gassam", "Jordan", "jordan.tcheagassam@esprit.tn", true, Role.INGENIEUR);
//		emS = new EmployeServiceImpl();
	}
	
	@Test
	public void testAjouterEmploye() {
		log.info("test Ajouter Employe");
	}

	@Test
	public void testMettreAjourEmailByEmployeId() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAffecterEmployeADepartement() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDesaffecterEmployeDuDepartement() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAjouterContrat() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAffecterContratAEmploye() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetEmployePrenomById() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployeById() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteContratById() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetNombreEmployeJPQL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllEmployeNamesJPQL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllEmployeByEntreprise() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMettreAjourEmailByEmployeIdJPQL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeleteAllContratJPQL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSalaireByEmployeIdJPQL() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSalaireMoyenByDepartementId() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetTimesheetsByMissionAndDate() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllEmployes() {
		//fail("Not yet implemented");
	}

}
