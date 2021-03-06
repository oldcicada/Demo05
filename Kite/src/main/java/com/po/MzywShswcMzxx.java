package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_SHSWC_MZXX")
public class MzywShswcMzxx implements Serializable {

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
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '葬式选择'")
	private String zsxz;

	@Column(columnDefinition = "VARCHAR(255) COMMENT '合葬信息(身份证号码+姓名)JSON'")
	private String hzxx;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '墓穴区域名称'")
	private String mxqymc;
	
	@Column(columnDefinition = "int COMMENT '墓穴价格'")
	private Integer mxjg;
	
	@Column(columnDefinition = "VARCHAR(14) COMMENT '购墓日期'")
	private String gmrq;
	
	@Column(columnDefinition = "VARCHAR(18)  COMMENT '经办人身份证号码'")
	private String jbrsfzhm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '经办人姓名'")
	private String jbrxm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '经办人联系电话'")
	private String jbrlxdh;

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
	@Column(columnDefinition = "VARCHAR(14) COMMENT '安葬日期'")
	private String azrq;

	public MzywShswcMzxx() {

	}

	public String getAzrq() {
		return azrq;
	}

	public void setAzrq(String azrq) {
		this.azrq = azrq;
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

	public String getZsxz() {
		return zsxz;
	}

	public void setZsxz(String zsxz) {
		this.zsxz = zsxz;
	}

	public String getHzxx() {
		return hzxx;
	}

	public void setHzxx(String hzxx) {
		this.hzxx = hzxx;
	}

	public String getMxqymc() {
		return mxqymc;
	}

	public void setMxqymc(String mxqymc) {
		this.mxqymc = mxqymc;
	}

	public Integer getMxjg() {
		return mxjg;
	}

	public void setMxjg(Integer mxjg) {
		this.mxjg = mxjg;
	}

	public String getGmrq() {
		return gmrq;
	}

	public void setGmrq(String gmrq) {
		this.gmrq = gmrq;
	}

	public String getJbrsfzhm() {
		return jbrsfzhm;
	}

	public void setJbrsfzhm(String jbrsfzhm) {
		this.jbrsfzhm = jbrsfzhm;
	}

	public String getJbrxm() {
		return jbrxm;
	}

	public void setJbrxm(String jbrxm) {
		this.jbrxm = jbrxm;
	}

	public String getJbrlxdh() {
		return jbrlxdh;
	}

	public void setJbrlxdh(String jbrlxdh) {
		this.jbrlxdh = jbrlxdh;
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
