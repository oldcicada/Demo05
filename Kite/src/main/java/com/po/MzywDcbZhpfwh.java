package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "T_MZYW_DCB_ZHPFWH")
public class MzywDcbZhpfwh implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(4) COMMENT '所属年度'")
	private String ssnd;

	@Column(columnDefinition = "Float COMMENT '所属批次'")
	private Float sspc;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '单位类型'")
	private String dwlx;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '单位'")
	private Long dw;

	@Column(columnDefinition = "VARCHAR(200) COMMENT '单位名称'")
	private String dwmc;

	@Column(columnDefinition = "SMALLINT  COMMENT '基本得分'")
	private Integer jndf;
	
	@Column(columnDefinition = "SMALLINT COMMENT '创新亮点'")
	private Integer cxld;
	
	@Column(columnDefinition = "SMALLINT COMMENT '表彰宣传'")
	private Integer bzxc;

	@Column(columnDefinition = "SMALLINT COMMENT '合计'")
	private Integer hj;

	@Column(columnDefinition = "INT COMMENT '名次'")
	private Integer mc;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '创建用户'")
	private String cjyh;

	@Column(columnDefinition = "VARCHAR(14) COMMENT '创建时间'")
	private String cjsj;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '最后修改用户'")
	private String zhxgyh;
	
	@Column(columnDefinition = "VARCHAR(14) COMMENT '最后修改时间'")
	private String zhxgsj;
	
	
	public MzywDcbZhpfwh() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSsnd() {
		return ssnd;
	}


	public void setSsnd(String ssnd) {
		this.ssnd = ssnd;
	}


	public Float getSspc() {
		return sspc;
	}


	public void setSspc(Float sspc) {
		this.sspc = sspc;
	}


	public String getDwlx() {
		return dwlx;
	}


	public void setDwlx(String dwlx) {
		this.dwlx = dwlx;
	}


	public Long getDw() {
		return dw;
	}


	public void setDw(Long dw) {
		this.dw = dw;
	}


	public String getDwmc() {
		return dwmc;
	}


	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}


	public Integer getJndf() {
		return jndf;
	}


	public void setJndf(Integer jndf) {
		this.jndf = jndf;
	}


	public Integer getCxld() {
		return cxld;
	}


	public void setCxld(Integer cxld) {
		this.cxld = cxld;
	}


	public Integer getBzxc() {
		return bzxc;
	}


	public void setBzxc(Integer bzxc) {
		this.bzxc = bzxc;
	}


	public Integer getHj() {
		return hj;
	}


	public void setHj(Integer hj) {
		this.hj = hj;
	}


	public Integer getMc() {
		return mc;
	}


	public void setMc(Integer mc) {
		this.mc = mc;
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
