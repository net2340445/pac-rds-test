package my.app.graal;


import java.util.List;

import javax.inject.Inject;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/userdefaultorganisation")
public class UserOrganisationController {
	
	@Inject
	UserOrganisationService userOrganisationService;

	@Get
	public List<UserOrganisationEntity> getDefaultOrganizationUserPreference() throws Exception {
		return userOrganisationService.getDefaultOrg();
	}
	
	
}
