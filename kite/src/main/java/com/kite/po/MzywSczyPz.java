package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_SCZY_PZ")
public class MzywSczyPz implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;

	@Column(columnDefinition = "VARCHAR(255) COMMENT '上传类型'")
	private String sclx;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '类型分隔符'")
	private String lxfgf;

	@Column(columnDefinition = "Float COMMENT '上传大小限制'")
	private Float scdxxz;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '分类名称'")
	private String flmc;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '名称简拼'")
	private String mcjp;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '存储类型[0-数据库存储,1-文件存储]'")
	private String cclx;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '路径类型[0-相对路径,1-物理路径]'")
	private String ljlx;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '存储路径'")
	private String cclj;
	
	public MzywSczyPz(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSclx() {
		return sclx;
	}

	public void setSclx(String sclx) {
		this.sclx = sclx;
	}

	public String getLxfgf() {
		return lxfgf;
	}

	public void setLxfgf(String lxfgf) {
		this.lxfgf = lxfgf;
	}

	public Float getScdxxz() {
		return scdxxz;
	}

	public void setScdxxz(Float scdxxz) {
		this.scdxxz = scdxxz;
	}

	public String getFlmc() {
		return flmc;
	}

	public void setFlmc(String flmc) {
		this.flmc = flmc;
	}

	public String getMcjp() {
		return mcjp;
	}

	public void setMcjp(String mcjp) {
		this.mcjp = mcjp;
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

	public String getCclj() {
		return cclj;
	}

	public void setCclj(String cclj) {
		this.cclj = cclj;
	}

}
