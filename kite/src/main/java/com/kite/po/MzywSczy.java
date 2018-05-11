package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_SCZY ")
public class MzywSczy implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '关联表名称'")
	private String glbmc;

	@Column(columnDefinition = "VARCHAR(32) COMMENT '关联表信息代码'")
	private String glbxxdm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '关联业务代码'")
	private String glywdm;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '存储类型[0-数据库存储,1-文件存储]'")
	private String cclx;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '路径类型[0-相对路径,1-物理路径]'")
	private String ljlx;
	
	@Column(columnDefinition = "VARCHAR(255) COMMENT '存储全路径'")
	private String ccqlj;
	
	@Column(columnDefinition = "VARCHAR(255) COMMENT '文件名'")
	private String wjm;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '文件类型'")
	private String wjlx;
	
	@Column(columnDefinition = "BLOB COMMENT '文件内容'")
	private byte[] wjnr;

	@Column(nullable=false,columnDefinition = "FLOAT COMMENT '文件大小'")
	private Float wjdx;

	@Column(nullable=false,columnDefinition = "VARCHAR(14) COMMENT '上传时间'")
	private String scsj;
	
	@Column(nullable=false,columnDefinition = "VARCHAR(50) COMMENT '有效标识'")
	private String ysbs;
	
	public MzywSczy(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGlbmc() {
		return glbmc;
	}

	public void setGlbmc(String glbmc) {
		this.glbmc = glbmc;
	}

	public String getGlbxxdm() {
		return glbxxdm;
	}

	public void setGlbxxdm(String glbxxdm) {
		this.glbxxdm = glbxxdm;
	}

	public String getGlywdm() {
		return glywdm;
	}

	public void setGlywdm(String glywdm) {
		this.glywdm = glywdm;
	}

	public String getCclx() {
		return cclx;
	}

	public void setCclx(String cclx) {
		this.cclx = cclx;
	}

	public String getLjlx() {
		return ljlx;
	}

	public void setLjlx(String ljlx) {
		this.ljlx = ljlx;
	}

	public String getCcqlj() {
		return ccqlj;
	}

	public void setCcqlj(String ccqlj) {
		this.ccqlj = ccqlj;
	}

	public String getWjm() {
		return wjm;
	}

	public void setWjm(String wjm) {
		this.wjm = wjm;
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

	public String getYsbs() {
		return ysbs;
	}

	public void setYsbs(String ysbs) {
		this.ysbs = ysbs;
	}

	public String getWjlx() {
		return wjlx;
	}

	public void setWjlx(String wjlx) {
		this.wjlx = wjlx;
	}
	

}
