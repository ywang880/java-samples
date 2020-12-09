package com.learning.java.app;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class App {

	public static void main(final String[] args) {
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient("localhost", 27017);

			// To connect to mongodb server
			MongoDatabase db = mongoClient.getDatabase("mydb");

			MongoCollection<Document> coll = db.getCollection("test");

			System.out.println("Collection created successfully");

			Customer c = new Customer("john", "Smith", 22, "Engineer", "john@gmail.com", "416-666-555");

			Gson gson = new Gson();
			String json = gson.toJson(c);
			Document doc = Document.parse(json.toString());

			// insert(dbObject);
			coll.insertOne(doc);

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} finally {
			if (mongoClient != null) {
				mongoClient.close();
			}
		}
	}
}