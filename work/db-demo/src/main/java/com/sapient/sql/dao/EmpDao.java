package com.sapient.sql.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.sql.contracts.IEmpDao;
import com.sapient.sql.entity.Emp;
import com.sapient.sql.util.GetConnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpDao implements IEmpDao {

	GetConnection gc;

	public EmpDao() {
		gc = new GetConnection();
	}

	@Override
	public boolean insertEmp(Emp emp) {
		String sql = "insert into emp values (?,?,?)";
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Emp getEmp(int empId) {
		String sql = "select empname, empsal from emp where empid=?";
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);

			gc.rs = gc.ps.executeQuery();
			if (gc.rs.next()) {
				Emp emp = new Emp();
				emp.setEmpId(empId);
				emp.setEmpName(gc.rs.getString(1));
				emp.setEmpSal(gc.rs.getDouble(2));
				return emp;
			} else {
				log.info("Record not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Emp> getAll() {
		String sql = "select empid, empname, empsal from emp";
		List<Emp> list = null;
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			list = new ArrayList();
			while (gc.rs.next()) {
				Emp emp = new Emp();
				emp.setEmpId(gc.rs.getInt(1));
				emp.setEmpName(gc.rs.getString(2));
				emp.setEmpSal(gc.rs.getDouble(3));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public boolean updateEmp(Emp emp) {
		String sql = "update emp set empname=?, empsal=? where empid=?";
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setString(1, emp.getEmpName());
			gc.ps.setDouble(2, emp.getEmpSal());
			gc.ps.setInt(3, emp.getEmpId());
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmp(Emp emp) {
		String sql = "delete from emp where empid=?";
		try {
			gc.ps = GetConnection.getPostGresConnection().prepareStatement(sql);
			gc.ps.setInt(1, emp.getEmpId());
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
