package org.parking.api.data;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

public interface BaseRepository {
	<T> Long count(Query query, Class<T> entityClass);
	
	<T> void create(T entity);
	
	<T> T retrieve(Query query, Class<T> entityClass);

	<T> List<T> loadAll(Query query, Class<T> entityClass);

	<T> void update(T req);

	<T> void delete(Query query, Class<T> entityClass);

	<T> void flush(String collectionName);

	MongoTemplate getMongoTemplate();

	void setMongoTemplate(MongoTemplate mongoTemplate);
}

