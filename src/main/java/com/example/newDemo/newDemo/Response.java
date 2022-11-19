package com.example.newDemo.newDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tododatabase")
public class Response
{
  @Id
  private Integer id;
  private String name;
  private String city;

  public Response() {
  }

  public Response(Integer id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
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

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
