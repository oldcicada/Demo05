package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_DCB_ZHPFCX")
public class MzywDcbZhpfCx implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '处室分类'")
	private String csfl;

	@Column(columnDefinition = "int(100) COMMENT '年度'")
	private int year;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '标题'")
	private String bt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCsfl() {
		return csfl;
	}

	public void setCsfl(String csfl) {
		this.csfl = csfl;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}

}
