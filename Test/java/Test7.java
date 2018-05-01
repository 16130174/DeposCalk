package Test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Rab;
public class Test7 {
@Test
public void testing(){
	Rab P = new Rab();
	double A=P.Summa(1, 2000, 9, 10);
	System.out.println(""+ A);		 
	if(A!=2150.0) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
