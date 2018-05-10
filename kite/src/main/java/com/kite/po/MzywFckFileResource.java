package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_FCK_FILE_RESOURCE")
public class MzywFckFileResource implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(nullable=false,columnDefinition = "VARCHAR(255) COMMENT '文件名'")
	private String wjm;

	@Column(nullable=false,columnDefinition = "VARCHAR(255) COMMENT '文件路径'")
	private String wjlj;

	@Column(nullable=false,columnDefinition = "VARCHAR(100) COMMENT '上级路径'")
	private String sjlj;
	
	@Column(nullable=false,columnDefinition = "VARCHAR(100) COMMENT '文件类型'")
	private String wjlx;

	@Column(columnDefinition = "BLOB COMMENT '文件内容'")
	private byte[] wjnr;

	@Column(nullable=false,columnDefinition = "FLOAT COMMENT '文件大小'")
	private Float wjdx;

	@Column(nullable=false,columnDefinition = "VARCHAR(14) COMMENT '上传时间'")
	private String scsj;
	
	public MzywFckFileResource(){
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWjm() {
		return wjm;
	}

	public void setWjm(String wjm) {
		this.wjm = wjm;
	}

	public String getWjlj() {
		return wjlj;
	}

	public void setWjlj(String wjlj) {
		this.wjlj = wjlj;
	}

	public String getSjlj() {
		return sjlj;
	}

	public void setSjlj(String sjlj) {
		this.sjlj = sjlj;
	}

	public String getWjlx() {
		return wjlx;
	}

	public void setWjlx(String wjlx) {
		this.wjlx = wjlx;
	}

	public byte[] getWjnr() {
		return wjnr;
	}

	public void setWjnr(byte[] wjnr) {
		this.wjnr = wjnr;
	}

	public Float getWjdx() {
		return wjdx;
	}

	public void setWjdx(Float wjdx) {
		this.wjdx = wjdx;
	}

	public String getScsj() {
		return scsj;
	}

	public void setScsj(String scsj) {
		this.scsj = scsj;
	}

}
