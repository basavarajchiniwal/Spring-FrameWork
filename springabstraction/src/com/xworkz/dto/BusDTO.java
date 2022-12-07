package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusDTO implements Serializable {
private String name;
private int noOfSeats;
private String compName;
private String owner;
}
