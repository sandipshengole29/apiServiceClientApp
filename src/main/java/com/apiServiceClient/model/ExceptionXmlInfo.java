/**
 * 
 */
package com.apiServiceClient.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnTransformer;


/**
 * @author Sandip.Shengole
 *
 */

@Entity
@Table(name="FILE_MAPPING_FIELD")
public class ExceptionXmlInfo implements Serializable {
	private static final long serialVersionUID = 6173797993865321358L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EXCEPTION_ID", nullable=false, unique=true)
	private Long exceptionId;

	@ColumnTransformer(read = "to_clob(exceptionXml)", write = "?")
	@Column( name = "EXCEPTION_XML", nullable = false, columnDefinition = "XMLType" )
	private String exceptionXml;

	@Column(name="EXCEPTION_TYPE", nullable=false)
	private String exceptionType;

	/**
	 * @return the exceptionId
	 */
	public Long getExceptionId() {
		return exceptionId;
	}

	/**
	 * @param exceptionId the exceptionId to set
	 */
	public void setExceptionId(Long exceptionId) {
		this.exceptionId = exceptionId;
	}

	/**
	 * @return the exceptionXml
	 */
	public String getExceptionXml() {
		return exceptionXml;
	}

	/**
	 * @param exceptionXml the exceptionXml to set
	 */
	public void setExceptionXml(String exceptionXml) {
		this.exceptionXml = exceptionXml;
	}

	/**
	 * @return the exceptionType
	 */
	public String getExceptionType() {
		return exceptionType;
	}

	/**
	 * @param exceptionType the exceptionType to set
	 */
	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}
	
}
