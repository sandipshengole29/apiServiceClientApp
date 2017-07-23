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


/**
 * @author Sandip.Shengole
 *
 */

@Entity
@Table(name="FILE_MAPPING_FIELD")
public class FileMappingField implements Serializable {
	private static final long serialVersionUID = -1900387839007401098L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true)
	private Long id;

	@Column(name="EXCEPTION_TYPE", nullable=false)
	private String exceptionType;

	@Column(name="FILE_FIELD", nullable=false)
	private String fileField;
	
	@Column(name="MAPPING_FIELD", nullable=false)
	private int mappingField;

	@Column(name="FIELD_DATA_TYPE", nullable=false)
	private int fieldDataType;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * @return the fileField
	 */
	public String getFileField() {
		return fileField;
	}

	/**
	 * @param fileField the fileField to set
	 */
	public void setFileField(String fileField) {
		this.fileField = fileField;
	}

	/**
	 * @return the mappingField
	 */
	public int getMappingField() {
		return mappingField;
	}

	/**
	 * @param mappingField the mappingField to set
	 */
	public void setMappingField(int mappingField) {
		this.mappingField = mappingField;
	}

	/**
	 * @return the fieldDataType
	 */
	public int getFieldDataType() {
		return fieldDataType;
	}

	/**
	 * @param fieldDataType the fieldDataType to set
	 */
	public void setFieldDataType(int fieldDataType) {
		this.fieldDataType = fieldDataType;
	}
	
}
