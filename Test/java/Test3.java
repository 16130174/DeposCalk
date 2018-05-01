package Test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Klient;
public class Test3 {
@Test
public void testing(){
	Klient R = new Klient();
	double A=R.Calk(105,100,5);
	System.out.println(""+ A);		 
	if(A!=12) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
