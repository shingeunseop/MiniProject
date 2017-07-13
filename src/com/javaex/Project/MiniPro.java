package com.javaex.Project;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniPro {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("*          전화번호 관리 프로그램                 *");
		System.out.println("*************************************");
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("--------------------------------------");

		Reader r = new FileReader("D:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(r);

		String str;
		ArrayList<Profile> profilelist = new ArrayList<Profile>();

		while (true) {
			str = br.readLine();

			if (str == null) {
				break;
			}

			String Part[] = str.split(",");

			Profile profile = new Profile();
			profile.setName(Part[0]);
			profile.setHp(Part[1]);
			profile.setCompany(Part[2]);
			profilelist.add(profile);

		}

		while (true) {
			System.out.print(">>메뉴번호:");

			int i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("<1.리스트>");
				for (int k = 0; k < profilelist.size(); k++) {
					profilelist.get(k).showInfo(k);
				}
								
				break;
			case 2:
				System.out.println("<2.등록>");
				System.out.println("");

				System.out.println(">이름:");
				String plus = sc.next();
				System.out.println("");

				System.out.println(">휴대전화:");
				String plus2 = sc.next();
				

				System.out.println(">집전화:");
				String plus3 = sc.next();

				System.out.println("");
				
				Profile addfile = new Profile();
				
				addfile.setName(plus);
				addfile.setHp(plus2);
				addfile.setCompany(plus3);
				profilelist.add(addfile);

				System.out.println("[등록되었습니다.]");
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.println(">번호:");
				int num = sc.nextInt();
				profilelist.remove(num-1);
				System.out.println("[삭제되었습니다.]");
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.println(">이름:");
				String search=sc.next();
				
				for(int j=0;j<profilelist.size();j++) {
				String[] word=profilelist.get(j).getName().split("");
				
				for(int k=0;k<word.length;k++) {
				if(search==word[k])
					profilelist.get(j).showInfo(j);}
				}
				break;
			case 5:
				System.out.println("*************************************");
				System.out.println("*            감사합니다.              *");
				System.out.println("*************************************");
				break;
				
			default:
				System.out.println("다시 입력해주세요");
				continue;
			}
			if(i==5)
				break;

		}

	}

}
