package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_SHSWC_YTWY")
public class MzywShswcYtwy implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(18) COMMENT '逝者身份证号码'")
	private String szsfzhm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '逝者姓名'")
	private String szxm;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '逝者户籍地'")
	private String szhjd;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '逝者死亡原因'")
	private String szswyy;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '逝者遗体运往地'")
	private String szytywd;

	@Column(columnDefinition = "VARCHAR(18)  COMMENT '申请人身份证号码'")
	private String sqrsfzhm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '申请人姓名'")
	private String sqrxm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '申请人联系电话'")
	private String sqrlxdh;

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
	
	@Column(columnDefinition = "VARCHAR(14) COMMENT '与死者关系'")
	private String gx;
	@Column(columnDefinition = "VARCHAR(50) COMMENT '遗体承担运输单位名称'")
	private String ytcdysdwmc;
	@Column(columnDefinition = "VARCHAR(50) COMMENT '殡仪馆名称'")
	private String bygmc;
	public MzywShswcYtwy() {

	}
	public String getBygmc() {
		return bygmc;
	}

	public String getYtcdysdwmc() {
		return ytcdysdwmc;
	}
	public void setYtcdysdwmc(String ytcdysdwmc) {
		this.ytcdysdwmc = ytcdysdwmc;
	}
	public void setBygmc(String bygmc) {
		this.bygmc = bygmc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSzsfzhm() {
		return szsfzhm;
	}

	public void setSzsfzhm(String szsfzhm) {
		this.szsfzhm = szsfzhm;
	}

	public String getSzxm() {
		return szxm;
	}

	public void setSzxm(String szxm) {
		this.szxm = szxm;
	}

	public String getSzhjd() {
		return szhjd;
	}

	public void setSzhjd(String szhjd) {
		this.szhjd = szhjd;
	}

	public String getSzswyy() {
		return szswyy;
	}

	public void setSzswyy(String szswyy) {
		this.szswyy = szswyy;
	}

	public String getSzytywd() {
		return szytywd;
	}

	public void setSzytywd(String szytywd) {
		this.szytywd = szytywd;
	}

	public String getSqrsfzhm() {
		return sqrsfzhm;
	}

	public void setSqrsfzhm(String sqrsfzhm) {
		this.sqrsfzhm = sqrsfzhm;
	}

	public String getSqrxm() {
		return sqrxm;
	}

	public void setSqrxm(String sqrxm) {
		this.sqrxm = sqrxm;
	}

	public String getSqrlxdh() {
		return sqrlxdh;
	}

	public void setSqrlxdh(String sqrlxdh) {
		this.sqrlxdh = sqrlxdh;
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

	public String getGx() {
		return gx;
	}

	public void setGx(String gx) {
		this.gx = gx;
	}
}
