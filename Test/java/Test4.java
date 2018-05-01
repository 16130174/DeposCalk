package Test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Klient;
public class Test4 {
@Test
public void testing(){
	Klient R = new Klient();
	double A=R.Calk(20000,10000,10);
	System.out.println(""+ A);		 
	if(A!=120) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
