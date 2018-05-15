package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_MZYW_ZD")
public class MzywZd implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '代码'")
	private String dm;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '名称'")
	private String mc;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '说明'")
	private String sm;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '类型简拼'")
	private String lxjp;

	@Column(columnDefinition = "VARCHAR(1) COMMENT '有效性'")
	private String yxx;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '排序'")
	private String px;
	
	
	public MzywZd() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDm() {
		return dm;
	}


	public void setDm(String dm) {
		this.dm = dm;
	}


	public String getMc() {
		return mc;
	}


	public void setMc(String mc) {
		this.mc = mc;
	}


	public String getSm() {
		return sm;
	}


	public void setSm(String sm) {
		this.sm = sm;
	}


	public String getLxjp() {
		return lxjp;
	}


	public void setLxjp(String lxjp) {
		this.lxjp = lxjp;
	}


	public String getYxx() {
		return yxx;
	}


	public void setYxx(String yxx) {
		this.yxx = yxx;
	}


	public String getPx() {
		return px;
	}


	public void setPx(String px) {
		this.px = px;
	}
	
}
