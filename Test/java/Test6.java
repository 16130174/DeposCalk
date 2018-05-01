package Test.java;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Klient;
public class Test6 {
@Test
public void testing(){
	Klient R = new Klient();
	double A=R.Calk(12000,6000,12);
	System.out.println(""+ A);		 
	if(A!=100) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
