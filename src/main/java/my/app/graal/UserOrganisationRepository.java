package my.app.graal;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.MYSQL)        
public abstract class UserOrganisationRepository implements CrudRepository<UserOrganisationEntity, Integer> { 
	
	 
}