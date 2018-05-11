package com.kite.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "T_MZYW_ZD")
public class MzywZd implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(length=32)
	private String id;

	@Column(columnDefinition = "VARCHAR(50) COMMENT '代码'")
	private String dm;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '名称'")
	private String mc;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '说明'")
	private String sm;

	@Column(columnDefinition = "VARCHAR(100) COMMENT '类型简拼'")
	private String lxjp;

	@Column(columnDefinition = "VARCHAR(1) COMMENT '有效性'")
	private String yxx;
	
	@Column(columnDefinition = "VARCHAR(100) COMMENT '排序'")
	private String px;
	
	
	public MzywZd() {
		
	}
	
}
