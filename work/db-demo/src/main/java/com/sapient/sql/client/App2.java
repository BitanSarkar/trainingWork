package com.sapient.sql.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import com.sapient.sql.entity.Emp2;
import com.sapient.sql.util.JPAUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App2 {
	public static void main(String[] args) {
		Emp2 emp = new Emp2();
		emp.setEmpId(101);
		emp.setEmpName("bidu");
		emp.setEmpSal(6565);

		EntityManager entityManager = JPAUtil.getEntityManager();
//		save(emp, entityManager);
//		delete(entityManager, emp.getEmpId());
//		update(emp, entityManager);
//		getEmp(entityManager, emp.getEmpId());
//		getAll(entityManager);
//		getEmpBetweenSalary(entityManager, 2000, 8000);
	}

	private static void getAll(EntityManager entityManager) {
		CriteriaQuery<Emp2> criteria = entityManager.getCriteriaBuilder().createQuery(Emp2.class);
		criteria.select(criteria.from(Emp2.class));
		List<Emp2> resultList = entityManager.createQuery(criteria).getResultList();

		for (Emp2 temp : resultList) {
			log.info("{}", temp);
		}
		// Alternate way
		Query q = entityManager.createNativeQuery("SELECT empid, empname, empsal FROM emp");
		List<Object[]> list = q.getResultList();
		list.forEach((t) -> log.info(t[0] + " " + t[1] + " " + t[2]));
	}

	private static void getEmpBetweenSalary(EntityManager entityManager, double minSal, double maxSal) {
		Query q = entityManager
				.createNativeQuery("SELECT empid, empname, empsal FROM emp WHERE empsal>? AND empsal< ?");
		q.setParameter(1, minSal);
		q.setParameter(2, maxSal);
		List<Object[]> list = q.getResultList();
		list.forEach((t) -> log.info(t[0] + " " + t[1] + " " + t[2]));
	}

	private static void getEmp(EntityManager entityManager, int empId) {
		Emp2 gotEmp = entityManager.find(Emp2.class, empId);
		log.info("{}", gotEmp);
	}

	private static void update(Emp2 emp, EntityManager entityManager) {
		entityManager.getTransaction().begin();
		entityManager.merge(emp);
		entityManager.getTransaction().commit();
	}

	private static void delete(EntityManager entityManager, int empId) {
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.getReference(Emp2.class, empId));
		entityManager.getTransaction().commit();
	}

	private static void save(Emp2 emp, EntityManager entityManager) {
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();
	}
}