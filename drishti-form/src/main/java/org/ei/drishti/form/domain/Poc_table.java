package org.ei.drishti.form.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Entity;



@Entity
@Table(name="poc_table")
@NamedQuery(name = Poc_table.FIND_BY_PHC_NAME, query = "select name from report.dim_phc dp where dp.id=(select phc from report.dim_anm da where da.anmidentifier = :anmid)")

public class Poc_table {
	
	public static final String FIND_BY_PHC_NAME="find.by.phc.name";
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "visitentityid")
	private String visitentityid;

	@Column(name = "phc")
	private List phc;
	
	@Column(name = "clientversion",  nullable=false, columnDefinition="character varying(35) default ''")
	private String clientversion;
 
	@Column(name = "serverversion",  nullable=false, columnDefinition="character varying(35) default ''")
	private String serverversion;
	
	@Column(name = "level",  nullable=false, columnDefinition="character varying(35) default ''")
	private String level;



	@Column(name = "entityidEC")
	private String entityidEC;

	@Column(name = "anmid")
	private String anmid;
	
	@Column(name = "visittype")
	private String visittype;


	public Poc_table() {
	}

	public Poc_table(String visitentityid, String anmid, String entityidEC,
			List phc, String visittype, String level, String clientversion, String serverversion) {
		this.visitentityid = visitentityid;
		this.entityidEC = entityidEC;
		this.phc = phc;
		this.anmid = anmid;
		this.visittype = visittype;
		this.clientversion=clientversion;
		this.serverversion=serverversion;
		this.level=level;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVisitentityid() {
		return visitentityid;
	}

	public void setVisitentityid(String visitentityid) {
		this.visitentityid = visitentityid;
	}

	public List getPhc() {
		return phc;
	}

	public void setPhc(List phc2) {
		this.phc = phc2;
	}

	public String getClientversion() {
		return clientversion;
	}

	public void setClientversion(String clientversion) {
		this.clientversion = clientversion;
	}

	public String getServerversion() {
		return serverversion;
	}

	public void setServerversion(String serverversion) {
		this.serverversion = serverversion;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getEntityidEC() {
		return entityidEC;
	}

	public void setEntityidEC(String entityidEC) {
		this.entityidEC = entityidEC;
	}

	public String getAnmid() {
		return anmid;
	}

	public void setAnmid(String anmid) {
		this.anmid = anmid;
	}

	public String getVisittype() {
		return visittype;
	}

	public void setVisittype(String visittype) {
		this.visittype = visittype;
	}

	@Override
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o, new String[] { "id" });
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, new String[] { "id" });
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


}
