package com.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "T_MZYW_AZC_BDXX")
public class MzywAzcBdxx implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;

	@Column(columnDefinition = "VARCHAR(18) COMMENT '士兵身份证号码'")
	private String sbsfzhm;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '姓名'")
	private String xm;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '籍贯'")
	private String jg;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '性别'")
	private String xb;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '政治面貌'")
	private String zzmm;

	@Column(columnDefinition = "VARCHAR(8) COMMENT '出生年月'")
	private String csny;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '文化程度'")
	private String whcd;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '居住地址'")
	private String jzdz;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '健康状况'")
	private String jkzg;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '军种'")
	private String jz;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '专业特长'")
	private String zytc;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '联系电话'")
	private String lxdh;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '入伍地点'")
	private String rwdd;
	
	@Column(columnDefinition = "VARCHAR(8) COMMENT '入伍时间'")
	private String rwsj;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '入伍通知编号'")
	private String rwtzbh;
	
	@Column(columnDefinition = "VARCHAR(50) COMMENT '退役部队名称'")
	private String tybdmc;

	@Column(columnDefinition = "VARCHAR(50)  COMMENT '入伍前户口性质'")
	private String rwqhkxx;

	@Column(columnDefinition = "VARCHAR(8) COMMENT '退伍时间'")
	private String twsj;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '受过奖励'")
	private String sgjl;
	
	@Column(columnDefinition = "VARCHAR(50)  COMMENT '退役证件编号'")
	private String tyzjbh;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '退役时是否领取退役金'")
	private String tyssflqtyj;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '是否参加免费培训'")
	private String sfcjmfpx;
	
	@Column(columnDefinition = "VARCHAR(50)  COMMENT '服役方式'")
	private String fyfs;

	@Column(columnDefinition = "VARCHAR(8) COMMENT '报道时间'")
	private String bdsj;

	@Column(columnDefinition = "VARCHAR(255) COMMENT '职业教育和技能培训信息JSON'")
	private String zyjyhjnpxxx;
	
	@Column(columnDefinition = "VARCHAR(50)  COMMENT '学校名称'")
	private String xxmc;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '其他专业意向'")
	private String qtzyyx;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '是否服从调整'")
	private String sffctz;

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
	
	@Column(columnDefinition = "VARCHAR(14) COMMENT '报送单位'")
	private String sbdw;

	public MzywAzcBdxx() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSbsfzhm() {
		return sbsfzhm;
	}

	public void setSbsfzhm(String sbsfzhm) {
		this.sbsfzhm = sbsfzhm;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getJg() {
		return jg;
	}

	public void setJg(String jg) {
		this.jg = jg;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getZzmm() {
		return zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getCsny() {
		return csny;
	}

	public void setCsny(String csny) {
		this.csny = csny;
	}

	public String getWhcd() {
		return whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getJzdz() {
		return jzdz;
	}

	public void setJzdz(String jzdz) {
		this.jzdz = jzdz;
	}

	public String getJz() {
		return jz;
	}

	public void setJz(String jz) {
		this.jz = jz;
	}

	public String getZytc() {
		return zytc;
	}

	public void setZytc(String zytc) {
		this.zytc = zytc;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getRwdd() {
		return rwdd;
	}

	public String getJkzg() {
		return jkzg;
	}

	public void setJkzg(String jkzg) {
		this.jkzg = jkzg;
	}

	public void setRwdd(String rwdd) {
		this.rwdd = rwdd;
	}

	public String getRwsj() {
		return rwsj;
	}

	public void setRwsj(String rwsj) {
		this.rwsj = rwsj;
	}

	public String getRwtzbh() {
		return rwtzbh;
	}

	public void setRwtzbh(String rwtzbh) {
		this.rwtzbh = rwtzbh;
	}

	public String getTybdmc() {
		return tybdmc;
	}

	public void setTybdmc(String tybdmc) {
		this.tybdmc = tybdmc;
	}

	public String getRwqhkxx() {
		return rwqhkxx;
	}

	public void setRwqhkxx(String rwqhkxx) {
		this.rwqhkxx = rwqhkxx;
	}

	public String getTwsj() {
		return twsj;
	}

	public void setTwsj(String twsj) {
		this.twsj = twsj;
	}

	public String getSgjl() {
		return sgjl;
	}

	public void setSgjl(String sgjl) {
		this.sgjl = sgjl;
	}

	public String getTyzjbh() {
		return tyzjbh;
	}

	public void setTyzjbh(String tyzjbh) {
		this.tyzjbh = tyzjbh;
	}

	public String getTyssflqtyj() {
		return tyssflqtyj;
	}

	public void setTyssflqtyj(String tyssflqtyj) {
		this.tyssflqtyj = tyssflqtyj;
	}

	public String getSfcjmfpx() {
		return sfcjmfpx;
	}

	public void setSfcjmfpx(String sfcjmfpx) {
		this.sfcjmfpx = sfcjmfpx;
	}

	public String getFyfs() {
		return fyfs;
	}

	public void setFyfs(String fyfs) {
		this.fyfs = fyfs;
	}

	public String getBdsj() {
		return bdsj;
	}

	public void setBdsj(String bdsj) {
		this.bdsj = bdsj;
	}

	public String getZyjyhjnpxxx() {
		return zyjyhjnpxxx;
	}

	public void setZyjyhjnpxxx(String zyjyhjnpxxx) {
		this.zyjyhjnpxxx = zyjyhjnpxxx;
	}

	public String getXxmc() {
		return xxmc;
	}

	public void setXxmc(String xxmc) {
		this.xxmc = xxmc;
	}

	public String getQtzyyx() {
		return qtzyyx;
	}

	public void setQtzyyx(String qtzyyx) {
		this.qtzyyx = qtzyyx;
	}

	public String getSffctz() {
		return sffctz;
	}

	public void setSffctz(String sffctz) {
		this.sffctz = sffctz;
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
	
	public String getSbdw() {
		return sbdw;
	}

	public void setSbdw(String sbdw) {
		this.sbdw = sbdw;
	}

}
