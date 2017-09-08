package com.techprimers.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer idalumno;
    private String alumno;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
     
	public Integer getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Integer idalumno) {
		this.idalumno = idalumno;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public Integer getNota1() {
		return nota1;
	}
	public void setNota1(Integer nota1) {
		this.nota1 = nota1;
	}
	public Integer getNota2() {
		return nota2;
	}
	public void setNota2(Integer nota2) {
		this.nota2 = nota2;
	}
	public Integer getNota3() {
		return nota3;
	}
	public void setNota3(Integer nota3) {
		this.nota3 = nota3;
	}

    
}
