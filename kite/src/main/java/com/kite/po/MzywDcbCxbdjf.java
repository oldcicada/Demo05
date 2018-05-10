package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "T_MZYW_DCB_PXBZJF")
public class MzywDcbCxbdjf implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '获奖名称'")
	private String hjmc;

	@Column(columnDefinition = "VARCHAR(8) COMMENT '表彰时间'")
	private String bzsj;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '颁奖单位名称'")
	private String bjdwmc;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '自评加分'")
	private String zpjf;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '报送时间'")
	private String bssj;
	
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
	
	public MzywDcbCxbdjf() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHjmc() {
		return hjmc;
	}

	public String getZpjf() {
		return zpjf;
	}

	public void setZpjf(String zpjf) {
		this.zpjf = zpjf;
	}

	public void setHjmc(String hjmc) {
		this.hjmc = hjmc;
	}

	public String getBzsj() {
		return bzsj;
	}

	public void setBzsj(String bzsj) {
		this.bzsj = bzsj;
	}

	public String getBjdwmc() {
		return bjdwmc;
	}

	public void setBjdwmc(String bjdwmc) {
		this.bjdwmc = bjdwmc;
	}

	public String getBssj() {
		return bssj;
	}

	public void setBssj(String bssj) {
		this.bssj = bssj;
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
