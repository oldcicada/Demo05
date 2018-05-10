package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "T_MZYW_ZJCL ")
public class MzywZjcl implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(32) COMMENT '映射表信息ID'")
	private String ysbxxid;

	@Column(columnDefinition = "VARCHAR(20) COMMENT '映射表表名'")
	private String ysbmc;

	@Column(columnDefinition = "VARCHAR(1) COMMENT '材料类型'")
	private String cllx;

	@Column(columnDefinition = "VARCHAR(1) COMMENT '关联状态'")
	private String zt;

	@Column(columnDefinition = "VARCHAR(18) COMMENT '身份证号码'")
	private String sfzhm;
	
	@Column(columnDefinition = "VARCHAR(200) COMMENT '姓名'")
	private String xm;
	
	@Column(columnDefinition = "VARCHAR(200) COMMENT '签发机构'")
	private String qfjg;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '户号'")
	private String hh;
	
	@Column(columnDefinition = "VARCHAR(8) COMMENT '有效期限开始时间'")
	private String yxqxkssj;
	
	@Column(columnDefinition = "VARCHAR(8) COMMENT '有效期限结束时间'")
	private String yxqxjssj;
	
	@Column(columnDefinition = "VARCHAR(14) COMMENT '创建时间'")
	private String cjsj;
	
	public MzywZjcl() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getCllx() {
		return cllx;
	}

	public void setCllx(String cllx) {
		this.cllx = cllx;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getSfzhm() {
		return sfzhm;
	}

	public void setSfzhm(String sfzhm) {
		this.sfzhm = sfzhm;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getQfjg() {
		return qfjg;
	}

	public void setQfjg(String qfjg) {
		this.qfjg = qfjg;
	}

	public String getHh() {
		return hh;
	}

	public void setHh(String hh) {
		this.hh = hh;
	}

	public String getYxqxkssj() {
		return yxqxkssj;
	}

	public void setYxqxkssj(String yxqxkssj) {
		this.yxqxkssj = yxqxkssj;
	}

	public String getYxqxjssj() {
		return yxqxjssj;
	}

	public void setYxqxjssj(String yxqxjssj) {
		this.yxqxjssj = yxqxjssj;
	}

	public String getCjsj() {
		return cjsj;
	}

	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	
}
