package my.app.graal;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class UserOrganisationService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(UserOrganisationService.class);
	
	@Inject
	UserOrganisationRepository userOrganisationRepository;


	public List<UserOrganisationEntity> getDefaultOrg(){
		List<UserOrganisationEntity> user = new ArrayList<>(); 
		userOrganisationRepository.findAll().iterator().forEachRemaining(user::add);
		return user;
	}
}
