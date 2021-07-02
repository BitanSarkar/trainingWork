package com.sapient.sql.contracts;

import java.util.List;

import com.sapient.sql.entity.Emp;

public interface IEmpDao {

	public boolean insertEmp(Emp emp);

	public Emp getEmp(int empId);

	public List<Emp> getAll();

	public boolean updateEmp(Emp emp);

	public boolean deleteEmp(Emp emp);
}
