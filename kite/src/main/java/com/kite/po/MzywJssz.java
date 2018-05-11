package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "T_MZYW_JSSZ")
public class MzywJssz implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '部门'")
	private String bm;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '部门名称'")
	private String tzggzw;

	@Column(columnDefinition = "VARCHAR(4) COMMENT '所属年度'")
	private String ssnd;

	@Column(columnDefinition = "Long COMMENT '基数'")
	private Long js;

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
	
	
	public MzywJssz() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getBm() {
		return bm;
	}


	public void setBm(String bm) {
		this.bm = bm;
	}


	public String getTzggzw() {
		return tzggzw;
	}


	public void setTzggzw(String tzggzw) {
		this.tzggzw = tzggzw;
	}


	public String getSsnd() {
		return ssnd;
	}


	public void setSsnd(String ssnd) {
		this.ssnd = ssnd;
	}


	public Long getJs() {
		return js;
	}


	public void setJs(Long js) {
		this.js = js;
	}


	public String getYxbs() {
		return yxbs;
	}


	public void setYxbs(String yxbs) {
		this.yxbs = yxbs;
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
