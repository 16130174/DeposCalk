package Test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Rab;
public class Test1 {
@Test
public void testing(){
	Rab P = new Rab();
	double A=P.Summa(1, 100000, 5, 12);
	System.out.println(""+ A);		 
	if(A!=105000.0) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
