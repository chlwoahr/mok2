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

		System.out.println("사원번호 입력");
		a = scn.nextInt();
		if (sere.getTexEmp(a) != null) {
			System.out.println("비밀번호 입력");
			a1 = scn.nextInt();
			if(sere.getTexEmp(a1) != null){
				System.out.println("로그인");
			}else if(sere.getTexEmp(a1) == null) {
				System.out.println("비밀번호가 틀립니다");
			}

		} else if(sere.getTexEmp(a)==null){
			System.out.println("없는 아이디입니다.");
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
					if (sert.getTexTile(b1)== null) {
						System.out.println("없는번호입니다.");
						
					}
					System.out.print("변경할 컬러");
					String b2 = scn.next();
					System.out.print("변경할 수량");
					int b3 = scn.nextInt();
					TexTile t = new TexTile(b1, null, b2, b3);
					sert.modifyTexTile(t);
				} else if (b == 3) {
					System.out.println("조회할 오더번호");
					int b1 = scn.nextInt();

					if (sert.getTexTile(b1) == null) {
						System.out.println("오더번호 잘못입력");
					} else if (sert.getTexTile(b1) != null) {
						TexTile t = sert.getTexTile(b1);
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

				} else if (b == 6) {
					while (true) {
						System.out.println("1.회원리스트 2.수정 3.삭제 4.이전");
						int b1 = scn.nextInt();
						if (b1 == 1) {
							List<TexEmp> t = sere.texemplist();
							for (TexEmp t1 : t) {
								System.out.println(t1.toString());
							}
						} else if (b1 == 2) {
							System.out.println("사원번호 입력");
							int emp = scn.nextInt();

							System.out.print("변경할 부서");
							String e = scn.next();
							System.out.print("패스워드 변경");
							int e1 = scn.nextInt();
							TexEmp t = new TexEmp(emp, null, null, e, 0, null, e1);
							sere.modifyTexEmp(t);

						} else if (b1 == 3) {
							System.out.println("삭제할 직원번호 입력");
							int emp = scn.nextInt();
							if (sere.getTexEmp(emp) == null) {
								System.out.println("삭제할 직원번호가 없습니다.");
							} else {
								System.out.println("삭제완료");
								sere.removeTexEmp(emp);
							}
						} else if (b1 == 4) {
							break;
						}
					} // while 종료
				} else if (b == 9) {
					break;
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
					if (sert.getTexTile(b1) == null) {
						System.out.println("오더번호를 잘못입력");
					} else {
						sert.modifyTexTile(t);
					}

				} else if (sa == 3) {
					System.out.println("조회할 오더번호");
					int b1 = scn.nextInt();
					TexTile t = sert.getTexTile(b1);
					if (t == null) {
						System.out.println("오더번호 잘못입력");
					} else {
						System.out.println(t.toString());
					}
				} else if (sa == 4) {
					List<TexTile> t = sert.textileList();
					for (TexTile t1 : t) {
						System.out.println(t1.toString());
					}
				} else if (sa == 5) {
					System.out.print("삭제할 오더번호입력");
					int o = scn.nextInt();
					if (sert.getTexTile(o) == null) {
						System.out.println("삭제할 상품이없습니다");
					} else {
						sert.removeTx(o);
						System.out.println("삭제완료");
					}

				}

			} // 회원번호 1 아닐때

		}System.out.println("종료");
		// end while

	} // end ex
	
}
