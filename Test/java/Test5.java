package Test.java;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Klient;
public class Test5 {
@Test
public void testing(){
	Klient R = new Klient();
	double A=R.Calk(40560,23400,10);
	System.out.println(""+ A);		 
	if(A!=88) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
