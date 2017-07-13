package com.javaex.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class MiniPro {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("*          전화번호 관리 프로그램                 *");
		System.out.println("*************************************");
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("--------------------------------------");
		
		Reader r=new FileReader("D:\\javaStudy\\파일\\phoneDB.txt");
		BufferedReader br=new BufferedReader(r);
		
		
		String str;
		Profile[] profile=new Profile[5];
		while(true) {
		str=br.readLine();
		
		if(str==null) {
			break;
		}
		
		String Part[]=str.split(",");
		
		int j=0;
		profile [j].setName(Part[0]);
		profile [j].setHp(Part[1]);
		profile [j].setCompany(Part[2]);
		j++;
				
		}
		
		while(true) {		
		System.out.print(">>메뉴번호:");
		
		int i=sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("<1.리스트>");
			for(int k=0;k<profile.length;k++) {
				System.out.println(k+1+". "+profile[k].getName()+"      "
			+profile[k].getHp()+"   "
						+profile[k].getCompany());
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
			default:
				System.out.println("다시 입력해주세요");
				continue;
		}
		
		}
		
		
		
		
	
		

	}

}
