package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_FCC_SQYLFWSS")
public class MzywFccSqylfwss implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '名称'")
	private String mc;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '联系人'")
	private String lxr;

	@Column(columnDefinition = "VARCHAR(20) COMMENT '联系电话'")
	private String lxdh;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '地址'")
	private String dz;
	
	@Column(columnDefinition = "VARCHAR(10) COMMENT '建筑面积'")
	private Integer jzmj;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '主要功能'")
	private Integer zygn;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '辖区基本情况'")
	private String xqjbqk;
	
	@Column(columnDefinition = "VARCHAR(200) COMMENT '开放时间安排'")
	private String kfsjap;
	
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

	public MzywFccSqylfwss() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}


	public Integer getJzmj() {
		return jzmj;
	}

	public void setJzmj(Integer jzmj) {
		this.jzmj = jzmj;
	}

	public Integer getZygn() {
		return zygn;
	}

	public void setZygn(Integer zygn) {
		this.zygn = zygn;
	}

	public String getXqjbqk() {
		return xqjbqk;
	}

	public void setXqjbqk(String xqjbqk) {
		this.xqjbqk = xqjbqk;
	}

	public String getKfsjap() {
		return kfsjap;
	}

	public void setKfsjap(String kfsjap) {
		this.kfsjap = kfsjap;
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
