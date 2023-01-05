package my.app.graal;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.micronaut.core.annotation.Introspected;

@Entity
@Table(name = "userorganisation")
@JsonSerialize
@Introspected
public class UserOrganisationEntity {
	@Id
	private int id;
	@Column(name = "USEREMAIL")
	private String useremail;
	@Column(name = "ORGID")
	private int orgId;
	@Column(name = "ISDEFAULTORG")
	private boolean isdefaultorg;
	@Basic(optional = false)
	@Column(name = "LASTMODIFIEDDATE", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastmodifieddate;
	
	@Basic(optional = false)
	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createddate;
	

	public UserOrganisationEntity(int id, String useremail, int orgId, boolean isdefaultorg, Date lastmodifieddate,
			Date createddate) {
		super();
		this.id = id;
		this.useremail = useremail;
		this.orgId = orgId;
		this.isdefaultorg = isdefaultorg;
		this.lastmodifieddate = lastmodifieddate;
		this.createddate = createddate;
	}


	public UserOrganisationEntity() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public int getOrgId() {
		return orgId;
	}


	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}


	public boolean getIsdefaultorg() {
		return isdefaultorg;
	}


	public void setIsdefaultorg(boolean isdefaultorg) {
		this.isdefaultorg = isdefaultorg;
	}


	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}


	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}


	public Date getCreateddate() {
		return createddate;
	}


	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
}
