package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_MZYW_FJXX")
public class MzywFjxx implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "VARCHAR(32) COMMENT '映射表信息ID'")
	private String ysbxxid;

	@Column(columnDefinition = "VARCHAR(20) COMMENT '映射表表名'")
	private String ysbmc;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '附件名称'")
	private String fjmc;

	@Column(columnDefinition = "BLOB COMMENT '附件内容'")
	private byte[] fjnr;

	@Column(columnDefinition = "FLOAT COMMENT '附件大小'")
	private Float fjdx;

	@Column(columnDefinition = "VARCHAR(10) COMMENT '附件后缀名'")
	private String fjhzm;

	@Column(columnDefinition = "VARCHAR(1) COMMENT '关联状态'")
	private String zt;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '创建时间'")
	private String cjsj;
	
	public MzywFjxx(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYsbxxid() {
		return ysbxxid;
	}

	public void setYsbxxid(String ysbxxid) {
		this.ysbxxid = ysbxxid;
	}

	public String getYsbmc() {
		return ysbmc;
	}

	public void setYsbmc(String ysbmc) {
		this.ysbmc = ysbmc;
	}

	public String getFjmc() {
		return fjmc;
	}

	public void setFjmc(String fjmc) {
		this.fjmc = fjmc;
	}

	public byte[] getFjnr() {
		return fjnr;
	}

	public void setFjnr(byte[] fjnr) {
		this.fjnr = fjnr;
	}

	public Float getFjdx() {
		return fjdx;
	}

	public void setFjdx(Float fjdx) {
		this.fjdx = fjdx;
	}

	public String getFjhzm() {
		return fjhzm;
	}

	public void setFjhzm(String fjhzm) {
		this.fjhzm = fjhzm;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getCjsj() {
		return cjsj;
	}

	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	
}
