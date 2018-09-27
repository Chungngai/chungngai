/**
This power calculation and main function is wrote by CHENG LIANG.
*/

import java.io.*;
import java.util.*;

public class MathGuru{

	public static void main(String[] args){
		
			boolean contn;
			int opt, n, res;
			
			Scanner sc = new Scanner(System.in);
			
			do{
				while(true){ //Step 1: Ask user select calculation types.
					System.out.println("Hello, this is MathGuru, we provide three types of math calculations for you, they are:\r\n1. 2^n, with input n. \r\n2. n!, with input n. \r\n3. fab(n), with input n, fab(n) is the n-th number in the Fibonacci sequence. \r\n\n Please choose one of them for calculating (either \"1\", \"2\", \"3\"):");
					String option = sc.nextLine();
					if(option.equals("1") || option.equals("2") || option.equals("3")){
						opt = Integer.parseInt(option);
						break;
					}
					else{
						System.out.println("Wrong input, please enter either \"1\", \"2\", or \"3\".");
					}
				}
				
				while(true){ //Step 2: Ask user to input value and calculate by invoking relative functions.
					System.out.println("Please input the value of n, n should be a postive integer which belows or equals 20 (i.e. 0<n<=20):");
					String num = sc.nextLine();
					try{
						n = Integer.parseInt(num);
					}
					catch(Exception e){
						System.out.println("Input error, please input integer.");
						continue;
					}
					if(n <= 0 || n > 20){
						System.out.println("Value out of range. Please input a value which > 0 and <= 20 :");
						continue;
					}
					
					res = n;
					switch(opt){
						case 1 : res = Power.twoToPow(n);break;
						case 2 : res = Fac.fac(n);break;
						case 3 : res = Power.fab(n);break;
						default : break;
					}
					
					System.out.println("Result: " + res);
					break;
				}
				
				
				
				while(true){ //Step 3: Ask user whether to try a again.
					System.out.println("Do you want to try again? (yes/no)");
					String constr = sc.nextLine();
					if(constr.equals("yes")){
						contn = true;
						break;
					}
					else if(constr.equals("no")){
						contn = false;
						break;
					}
					else {
						System.out.println("Wrong input, please input \" yes \" or \" no \". ");
					}
				}
					
			}while(contn);
	}
}


