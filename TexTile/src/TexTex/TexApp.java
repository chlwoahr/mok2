package TexTex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class TexApp {
	public void execute() {
		TexIf sert = new TextileOracle();
		TexempIf sere = new TexEmpOracle();
		Scanner scn = new Scanner(System.in);
		int a = 0, a1 = 0;
		try {
			System.out.println("사원번호 입력");
			a = scn.nextInt();
			System.out.println("비밀번호 입력");
			a1 = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자입력");
			scn.next();
		}

		TexEmp tt = sere.log(a, a1);
		if (tt == null) {
			System.out.println("잘못입력하였습니다");
			scn.next();
		} else {
			System.out.println("로그인성공");
		}

		while (true) {

			if (a == 1) {
				System.out.println("메뉴선택 : 1.상품추가 2.수정 3.한건조회 4.리스트 5.삭제 6.회원정보 9.종료");
				int b = scn.nextInt();
				if (b == 1) {
					System.out.print("오더번호 입력");
					int b1 = scn.nextInt();
					System.out.print("상품이름");
					String b2 = scn.next();
					System.out.print("컬러");
					String b3 = scn.next();
					System.out.println("수량");
					int b4 = scn.nextInt();
					TexTile t = new TexTile(b1, b2, b3, b4);
					sert.insertTexTile(t);

				} else if (b == 2) {
					System.out.print("오더번호 입력");
					int b1 = scn.nextInt();
					System.out.print("변경할 컬러");
					String b2 = scn.next();
					System.out.print("변경할 수량");
					int b3 = scn.nextInt();
					TexTile t = new TexTile(b1, null, b2, b3);
					sert.modifyTexTile(t);
				} else if (b == 3) {
					System.out.println("조회할 오더번호");
					int b1 = scn.nextInt();
					TexTile t = sert.getTexTile(b1);
					if (t == null) {
						System.out.println("오더번호 잘못입력");
					} else {
						System.out.println(t.toString());
					}

				} else if (b == 4) {
					List<TexTile> t = sert.textileList();
					for (TexTile t1 : t) {
						System.out.println(t1.toString());
					}
				} else if (b == 5) {
					System.out.print("삭제할 오더번호입력");
					int o = scn.nextInt();
					if (sert.getTexTile(o) == null) {
						System.out.println("삭제할 상품이없습니다");
					} else {
						sert.removeTx(o);
						System.out.println("삭제완료");
					}

				} else if (b==6) {
					System.out.println("");
				}

			} else {
				System.out.println("메뉴선택 : 1.상품추가 2.수정 3.한건조회 4.리스트 5.삭제");
				int sa = scn.nextInt();
				if (sa == 1) {
					System.out.print("오더번호 입력");
					int b1 = scn.nextInt();
					System.out.print("상품이름");
					String b2 = scn.next();
					System.out.print("컬러");
					String b3 = scn.next();
					System.out.println("수량");
					int b4 = scn.nextInt();
					TexTile t = new TexTile(b1, b2, b3, b4);
					sert.insertTexTile(t);
				} else if (sa == 2) {
					System.out.print("오더번호 입력");
					int b1 = scn.nextInt();
					System.out.print("변경할 컬러");
					String b2 = scn.next();
					System.out.print("변경할 수량");
					int b3 = scn.nextInt();
					TexTile t = new TexTile(b1, null, b2, b3);
					sert.modifyTexTile(t);
				} else if (sa == 3) {
					System.out.println("조회할 오더번호");
					int b1 = scn.nextInt();
					TexTile t = sert.getTexTile(b1);
					if (t == null) {
						System.out.println("오더번호 잘못입력");
					} else {
						System.out.println(t.toString());
					}
				} else if (sa ==4) {
					List<TexTile> t = sert.textileList();
					for(TexTile t1 : t) {
						System.out.println(t1.toString());
					}
				} else if (sa==5) {
					System.out.print("삭제할 오더번호입력");
					int o = scn.nextInt();
					if (sert.getTexTile(o) == null) {
						System.out.println("삭제할 상품이없습니다");
					} else {
						sert.removeTx(o);
						System.out.println("삭제완료");
					}
				}

			}//회원번호 1 아닐때

		}// end while

	} //end ex
}
