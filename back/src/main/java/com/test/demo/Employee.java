package com.test.demo;

import jakarta.persistence.Column;  
import jakarta.persistence.Entity;  
import jakarta.persistence.Id;  
import jakarta.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Employee   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column  
private int id;  
//defining name as column name  
@Column  
private String name;  
//defining email as column name  
@Column  
private String email;  
//defining phone as column name  
@Column  
private String phone;  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public String getPhone()   
{  
return phone;  
}  
public void setPhone(String phone)   
{  
this.phone = phone;  
}  
public String getEmail()   
{  
return email;  
}  
public void setEmail(String email)   
{  
this.email = email;  
}  
}  
