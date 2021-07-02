package com.sapient.mongoDB.client;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.conversions.Bson;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.sapient.mongoDB.entity.Employee;

import lombok.extern.slf4j.Slf4j;
import util.MongoUtil;

@Slf4j
public class App {

	public static void main(String[] args) {
		MongoClient mc = MongoUtil.mongoUtilCodedRegistray();
		MongoDatabase bitDB = mc.getDatabase("bitanDB");
		MongoCollection<Employee> empsCollection = bitDB.getCollection("emps", Employee.class);

		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpName("From Docker");
		emp.setEmpSal(1234);
		insertOne(empsCollection, emp);
//		
//		
//		List<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(110, "Bitan", 1234));
//		list.add(new Employee(111, "Bidisha", 4321));
//		list.add(new Employee(112, "Johny", 5555));
//		insertMany(empsCollection, list);

//		Employee record = empsCollection.find(Filters.eq("empId", 112)).first();
//		log.info("{}", record);

//		Iterator<Employee> it = empsCollection.find().iterator();
//		while (it.hasNext()) {
//			Employee next = it.next();
//			log.info("{}", next);
//		}

//		Bson condition = gte("empId", 111);
//		int limit = 2;
//		empsCollection.find(condition).limit(limit).iterator().forEachRemaining((emp) -> log.info("{}", emp));
//
//		Bson condition = Filters.gte("empId", 111);
//		empsCollection.find(condition).iterator().forEachRemaining((emp) -> log.info("{}", emp));

//		Bson condition = and(gte("empId", 111), lt("empId", 112));
//		int limit = 2;
//		empsCollection.find(condition).limit(limit).iterator().forEachRemaining((emp) -> log.info("{}", emp));
		// empsCollection.updateMany(eq("empId"), null);
	}

	private static void updateMany(MongoCollection<Employee> empsCollection) {
		// update city to 111

		UpdateResult updateMany = empsCollection.updateMany(eq("empId", 111), Updates.set("city", "Bengaluru"));

		log.info("no of records updated : {}", updateMany.getModifiedCount());
	}

	private static void deleteOne(MongoCollection<Employee> empsCollection) {
		DeleteResult deleteResult = empsCollection.deleteOne(eq("empName", "Harry"));
		log.info("Number of Reocords Delted: {}", deleteResult.getDeletedCount());
	}

	private static void deleteMany(MongoCollection<Employee> empsCollection) {
		DeleteResult deleteManyResult = empsCollection.deleteMany(eq("empName", "Sushruth"));
		log.info("Number of Reocords Delete : {}", deleteManyResult.getDeletedCount());
	}

	private static void findWithCondition(MongoCollection<Employee> empsCollection, Bson condition, int limit) {
//		empsCollection.find(condition).iterator().forEachRemaining((emp) -> log.info("{}", emp) );
		empsCollection.find(condition).limit(limit).iterator().forEachRemaining((emp) -> log.info("{}", emp));
	}

	private static void findAll(MongoCollection<Employee> empsCollection) {
		FindIterable<Employee> iterable = empsCollection.find();
		MongoCursor<Employee> iterator = iterable.iterator();

		while (iterator.hasNext()) {
			Employee next = iterator.next();
			log.info("{}", next);
		}
	}

	static Block<Employee> printBlock = new Block<Employee>() {
		@Override
		public void apply(final Employee emp) {
			System.out.println("--- " + emp);
		}
	};

	private static Employee getOneRecord(MongoCollection<Employee> empsCollection) {
		return empsCollection.find(eq("empId", 111)).first();
	}

	private static void insertMany(MongoCollection<Employee> empsCollection) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(110, "Sushruth", 1234));
		list.add(new Employee(111, "Kanva", 1122));

		empsCollection.insertMany(list);
	}

	private static void insertOne(MongoCollection<Employee> empsCollection, Employee emp) {

		// to check if the emp object has values
		// if not throw exception

//		or  hibernate validator  
		empsCollection.insertOne(emp);
	}

//	private static void connectionOldStyle() {
//		// by default look for localhost / 27017
//		MongoClient mongoClient = new MongoClient();
//		
//		log.info("Connection to DB :  {}", mongoClient.getConnectPoint());
//		log.info("List of DBS");
//		
//		for(String dbName : mongoClient.getDatabaseNames()) {
//			log.info(dbName);
//		}
//	}
//	}
}