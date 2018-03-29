package com.kgfsl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo
{
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
public Long id;
@Column
public String name;
@Column
public  int age;
/**
 * @return the id
 */
public Long getId() {
    return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
    this.id = id;
}
/**
 * @return the name
 */
public String getName() {
    return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
    this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
    return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
    this.age = age;
}
@Override
public String toString() {
    return "id: "+id+",name: " + name+",age: "+age;
}

}