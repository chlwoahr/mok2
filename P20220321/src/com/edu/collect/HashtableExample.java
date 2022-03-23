package com.edu.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("아이디랑 비밀번호를 입력하세요");
			System.out.print("아이디>");
			String i = scn.next();
			System.out.print("비밀번호>");
			String p = scn.next();
			System.out.println();

			if (map.containsKey(i)) {
				if (map.get(i).equals(p)) {
					System.out.println("로그인되었습니다");
					break;
				} else {
					System.out.println("비밀번호 불일치");
				}	
			}else {
					System.out.println("입력하신 아이디가 존재하지 않습니다");
				}

			}

		}

	}


