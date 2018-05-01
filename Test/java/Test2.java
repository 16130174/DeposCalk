package Test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import main.java.Base.Rab;
public class Test2 {
@Test
public void testing(){
	Rab P = new Rab();
	double A=P.Summa(0, 100000, 5, 12);
	System.out.println(""+ A);		 
	if(A!=179585.632602213) { Assert.fail(); 
	System.out.println("Test failed!");}
else {
	System.out.println("Congratulations! Test successful!");}
}}
