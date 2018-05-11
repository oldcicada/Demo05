package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_BNB")
public class MzywBnb implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;
	
	@Column(columnDefinition = "VARCHAR(20) COMMENT '信息标题'")
	private String xxbt;
	
	@Column(columnDefinition = "VARCHAR(255) COMMENT '不能办基本情况'")
	private String bnbjbqk;

	@Column(columnDefinition = "VARCHAR(255) COMMENT '不能办原因'")
	private String bnbyy;
	
	@Column(columnDefinition = "VARCHAR(255) COMMENT '科处室意见'")
	private String kcsyj;
	
	@Column(columnDefinition = "VARCHAR(200) COMMENT '领导意见'")
	private String ldyj;

	@Column(columnDefinition = "VARCHAR(8) COMMENT '办结时间'")
	private String bjsj;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '办结情况'")
	private String bjqk;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '备注'")
	private String bz;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '上报单位'")
	private String sbdw;
	
	@Column(columnDefinition = "VARCHAR(200) COMMENT '上报单位名称'")
	private String sbdwmc;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '暂存报送'")
	private String zcbs;

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

	public MzywBnb() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBnbjbqk() {
		return bnbjbqk;
	}

	public void setBnbjbqk(String bnbjbqk) {
		this.bnbjbqk = bnbjbqk;
	}

	public String getBnbyy() {
		return bnbyy;
	}

	public void setBnbyy(String bnbyy) {
		this.bnbyy = bnbyy;
	}

	public String getKcsyj() {
		return kcsyj;
	}

	public void setKcsyj(String kcsyj) {
		this.kcsyj = kcsyj;
	}

	public String getLdyj() {
		return ldyj;
	}

	public void setLdyj(String ldyj) {
		this.ldyj = ldyj;
	}

	public String getBjsj() {
		return bjsj;
	}

	public void setBjsj(String bjsj) {
		this.bjsj = bjsj;
	}

	public String getBjqk() {
		return bjqk;
	}

	public void setBjqk(String bjqk) {
		this.bjqk = bjqk;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSbdw() {
		return sbdw;
	}

	public void setSbdw(String sbdw) {
		this.sbdw = sbdw;
	}

	public String getSbdwmc() {
		return sbdwmc;
	}

	public void setSbdwmc(String sbdwmc) {
		this.sbdwmc = sbdwmc;
	}

	public String getZcbs() {
		return zcbs;
	}

	public void setZcbs(String zcbs) {
		this.zcbs = zcbs;
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
