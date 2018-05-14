package com.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	 @Column(columnDefinition="VARCHAR(20) COMMENT '登录用户名 '")
	 private String name;
	 @Column(columnDefinition="VARCHAR(20) COMMENT '登录密码'")
	 private String password;
	 @Column(columnDefinition="VARCHAR(20) COMMENT '管理权限'")
	 private String power;
	 @Column(columnDefinition="VARCHAR(20) COMMENT '所属部门'")
	 private String department;
	 
	 
	 public User() {
		 
	 }

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}



	
}
