package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_FCC_YLJGXX")
public class MzywFccYljgxx implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '名称'")
	private String mc;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '联系人'")
	private String lxr;

	@Column(columnDefinition = "VARCHAR(20) COMMENT '联系电话'")
	private String lxdh;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '地址'")
	private String dz;
	
	@Column(columnDefinition = "INT COMMENT '入住率'")
	private Integer rzl;

	@Column(columnDefinition = "INT COMMENT '总床位数'")
	private Integer zcws;

	@Column(columnDefinition = "VARCHAR(20) COMMENT '房屋性质'")
	private String fwxz;
	
	@Column(columnDefinition = "VARCHAR(20) COMMENT '服务对象类型'")
	private String fwdxlx;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '院长'")
	private Integer yz;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '副院长'")
	private Integer fyz;

	@Column(columnDefinition = "MEDIUMINT COMMENT '中层管理人员'")
	private Integer zcglry;

	@Column(columnDefinition = "MEDIUMINT COMMENT '医生'")
	private Integer ys;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '护士'")
	private Integer hs;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '财务'")
	private Integer cw;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '社工'")
	private Integer sg;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '心理咨询师'")
	private Integer xlzxs;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '技师'")
	private Integer js;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '高级'")
	private Integer gj;
	
	@Column(columnDefinition = "MEDIUMINT COMMENT '初级'")
	private Integer cj;
	
	@Column(columnDefinition = "INT COMMENT '人员持证上岗率'")
	private Integer ryczsgl;
	
	@Column(columnDefinition = "VARCHAR(20) COMMENT '等级评定'")
	private Integer djpd;
	
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

	public MzywFccYljgxx() {

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

	public Integer getRzl() {
		return rzl;
	}

	public void setRzl(Integer rzl) {
		this.rzl = rzl;
	}

	public Integer getZcws() {
		return zcws;
	}

	public void setZcws(Integer zcws) {
		this.zcws = zcws;
	}

	public String getFwxz() {
		return fwxz;
	}

	public void setFwxz(String fwxz) {
		this.fwxz = fwxz;
	}

	public String getFwdxlx() {
		return fwdxlx;
	}

	public void setFwdxlx(String fwdxlx) {
		this.fwdxlx = fwdxlx;
	}

	public Integer getYz() {
		return yz;
	}

	public void setYz(Integer yz) {
		this.yz = yz;
	}

	public Integer getFyz() {
		return fyz;
	}

	public void setFyz(Integer fyz) {
		this.fyz = fyz;
	}

	public Integer getZcglry() {
		return zcglry;
	}

	public void setZcglry(Integer zcglry) {
		this.zcglry = zcglry;
	}

	public Integer getYs() {
		return ys;
	}

	public void setYs(Integer ys) {
		this.ys = ys;
	}

	public Integer getHs() {
		return hs;
	}

	public void setHs(Integer hs) {
		this.hs = hs;
	}

	public Integer getCw() {
		return cw;
	}

	public void setCw(Integer cw) {
		this.cw = cw;
	}

	public Integer getSg() {
		return sg;
	}

	public void setSg(Integer sg) {
		this.sg = sg;
	}

	public Integer getXlzxs() {
		return xlzxs;
	}

	public void setXlzxs(Integer xlzxs) {
		this.xlzxs = xlzxs;
	}

	public Integer getJs() {
		return js;
	}

	public void setJs(Integer js) {
		this.js = js;
	}

	public Integer getGj() {
		return gj;
	}

	public void setGj(Integer gj) {
		this.gj = gj;
	}

	public Integer getCj() {
		return cj;
	}

	public void setCj(Integer cj) {
		this.cj = cj;
	}

	public Integer getRyczsgl() {
		return ryczsgl;
	}

	public void setRyczsgl(Integer ryczsgl) {
		this.ryczsgl = ryczsgl;
	}

	public Integer getDjpd() {
		return djpd;
	}

	public void setDjpd(Integer djpd) {
		this.djpd = djpd;
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
