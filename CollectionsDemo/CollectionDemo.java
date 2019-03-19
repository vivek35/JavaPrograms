package com.collections.excercise;

import java.io.*;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int ch;
		List<Object> collect=new ArrayList<Object>();
		collect.add("One");
		collect.add(2);
		collect.add("Three");
		collect.add(67.986);
		collect.add('Z');
		collect.add("ABC");
		collect.add(123);
		collect.add(true);
		collect.add("XYZ");
		do {
			System.out.println("Press 1 to Enter The New Element");
			System.out.println("Press 2 display all the elements");
			System.out.println("Press 3 terminate");
			System.out.println("Enter your choice");
			ch=Integer.parseInt(input.nextLine());
			if(ch==1) {
				System.out.println("Enter the element");
				if(input.hasNextBoolean()) {
					System.out.println("Entered element is boolean");
					boolean data=input.nextBoolean();
					input.nextLine();
					
					if(data) {
						data=false;
					}else {
						data=true;
					}
					int pos;
					do {
						System.out.println("Enter the position at which you want element to be inserted");
						pos=Integer.parseInt(input.nextLine());
						if(pos>5) {
							System.out.println("Only values between 1-5 are allowed, please try again");
						}
					}while(!(pos<6));
					collect.add(pos,data);
					System.out.println("You have entered "+data+" at "+pos+" position");
				}else if(input.hasNextInt()) {
					System.out.println("Entered element is integer");
					int data=input.nextInt();
					input.nextLine();
					data=data+1;
					int pos;
					do {
						System.out.println("Enter the position at which you want element to be inserted");
						pos=Integer.parseInt(input.nextLine());
						if(pos>5) {
							System.out.println("Only values between 1-5 are allowed, please try again");
						}
					}while(!(pos<6));
					collect.add(pos,data);
					System.out.println("You have entered "+data+" at "+pos+" position");
				}else if(input.hasNextFloat()) {
					System.out.println("Entered element is float");
					float data=input.nextFloat();
					input.nextLine();
					data=data+2;
					int pos;
					do {
						System.out.println("Enter the position at which you want element to be inserted");
						pos=Integer.parseInt(input.nextLine());
						if(pos>5) {
							System.out.println("Only values between 1-5 are allowed, please try again");
						}
					}while(!(pos<6));
					collect.add(pos,data);
					System.out.println("You have entered "+data+" at "+pos+" position");
				}else if(input.hasNextDouble()) {
					System.out.println("Entered element is double");
					double data=input.nextDouble();
					input.nextLine();
					data=data+2;
					System.out.println("Enter the position at which you want element to be inserted");
					int pos;
					do {
						System.out.println("Enter the position at which you want element to be inserted");
						pos=Integer.parseInt(input.nextLine());
						if(pos>5) {
							System.out.println("Only values between 1-5 are allowed, please try again");
						}
					}while(!(pos<6));
					collect.add(pos,data);
					System.out.println("You have entered "+data+" at "+pos+" position");
				}else {
					String str = input.nextLine();
					if(str.length()==1) {
						if(str.equals("#")) {
							System.out.println("Program Terminates");
							System.exit(0);					
						}
						System.out.println("Entered element is character");
						char data=str.charAt(0);
						int ascii=(int)data;
						ascii = ascii+1;
						data=(char)(ascii);
						int pos;
						do {
							System.out.println("Enter the position at which you want element to be inserted");
							pos=Integer.parseInt(input.nextLine());
							if(pos>5) {
								System.out.println("Only values between 1-5 are allowed, please try again");
							}
						}while(!(pos<6));
						collect.add(pos,data);
						System.out.println("You have entered "+data+" at "+pos+" position");
					}else {
						System.out.println("Entered element is String");
						String new_data="";
						for(int j=0;j<str.length();j++) {
							if(Character.isUpperCase(str.charAt(j))) {
								new_data=new_data+(Character.toLowerCase(str.charAt(j)));
							}else {
								new_data=new_data+(Character.toUpperCase(str.charAt(j)));
							}
						}
						System.out.println("Enter the position at which you want element to be inserted");
						int pos;
						do {
							System.out.println("Enter the position at which you want element to be inserted");
							pos=Integer.parseInt(input.nextLine());
							if(pos>5) {
								System.out.println("Only values between 1-5 are allowed, please try again");
							}
						}while(!(pos<6));
						collect.add(pos,new_data);
						System.out.println("You have entered "+new_data+" at "+pos+" position");
					}
				}
			}
			if(ch==2) {
				for (int m = 0; m < collect.size(); m++)  
		            System.out.println(m+":"+collect.get(m)); 
			}
		}while(ch!=3);
		
	}

}
