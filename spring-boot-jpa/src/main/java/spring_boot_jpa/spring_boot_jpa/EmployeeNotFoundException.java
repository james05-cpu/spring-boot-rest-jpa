package spring_boot_jpa.spring_boot_jpa;

public class EmployeeNotFoundException extends RuntimeException {
	 EmployeeNotFoundException(Long id) {
		    super("Could not find employee " + id);
		  }
}
