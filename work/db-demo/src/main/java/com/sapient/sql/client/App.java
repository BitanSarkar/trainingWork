package com.sapient.sql.client;

import com.sapient.sql.contracts.IEmpDao;
import com.sapient.sql.dao.EmpDao;
import com.sapient.sql.entity.Emp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setEmpId(103);
		emp.setEmpName("---");
		emp.setEmpSal(0);

		IEmpDao dao = new EmpDao();

		// log.info("{}", dao.insertEmp(emp) ? "Record inserted" : "Not inserted");
		// log.info("{}", dao.getEmp(103));
		dao.getAll().forEach((t) -> log.info("{}", t));
		// log.info("{}", dao.updateEmp(emp) ? "Record updated" : "Not updated");
		// log.info("{}", dao.deleteEmp(emp) ? "Record deleted" : "Not deleted");
	}
}
