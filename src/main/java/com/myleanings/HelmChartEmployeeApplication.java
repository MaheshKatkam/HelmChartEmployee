package com.myleanings;

import com.myleanings.dto.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequestMapping("api/employee")
@RestController
public class HelmChartEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelmChartEmployeeApplication.class, args);
	}

	@GetMapping("/getEmployees")
	public List<Employee> getCustomers(){
		return Arrays.asList(
				new Employee(124,"Mahesh","435345345345"),
				new Employee(125,"Vardhan","54645534535"),
				new Employee(126,"Mahalakshmi","7576666666"),
				new Employee(127,"Sukanya","123333333")
		);
	}

}
