package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_TZGG ")
public class MzywTzgg implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '通知公告标题'")
	private String tzggbt;

	@Column(columnDefinition = "MEDIUMTEXT COMMENT '通知公告正文'")
	private String tzggzw;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '通知公告状态'")
	private String tzggzt;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '发布时间'")
	private String fbsj;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '发布处室'")
	private String fbcs;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '发布处室名称'")
	private String fbchmc;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '有效标识'")
	private String yxbs;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '创建用户'")
	private String cjyh;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '创建时间'")
	private String cjsj;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '最后修改用户'")
	private String zhxgyh;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '最后修改时间'")
	private String zhxgsj;

	public MzywTzgg() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTzggbt() {
		return tzggbt;
	}

	public void setTzggbt(String tzggbt) {
		this.tzggbt = tzggbt;
	}

	public String getTzggzw() {
		return tzggzw;
	}

	public void setTzggzw(String tzggzw) {
		this.tzggzw = tzggzw;
	}

	public String getTzggzt() {
		return tzggzt;
	}

	public void setTzggzt(String tzggzt) {
		this.tzggzt = tzggzt;
	}

	public String getFbsj() {
		return fbsj;
	}

	public void setFbsj(String fbsj) {
		this.fbsj = fbsj;
	}

	public String getFbcs() {
		return fbcs;
	}

	public void setFbcs(String fbcs) {
		this.fbcs = fbcs;
	}

	public String getFbchmc() {
		return fbchmc;
	}

	public void setFbchmc(String fbchmc) {
		this.fbchmc = fbchmc;
	}

	public String getCjyh() {
		return cjyh;
	}

	public void setCjyh(String cjyh) {
		this.cjyh = cjyh;
	}

	public String getCjsj() {
		return cjsj;
	}

	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}

	public String getZhxgyh() {
		return zhxgyh;
	}

	public void setZhxgyh(String zhxgyh) {
		this.zhxgyh = zhxgyh;
	}

	public String getZhxgsj() {
		return zhxgsj;
	}

	public void setZhxgsj(String zhxgsj) {
		this.zhxgsj = zhxgsj;
	}

}
