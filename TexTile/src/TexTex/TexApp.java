package TexTex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.xml.stream.events.EndDocument;

public class TexApp {
	public void execute() {

		TexIf sert = new TextileOracle();
		TexempIf sere = new TexEmpOracle();
		Scanner scn = new Scanner(System.in);
		int a = 0, a1 = 0;

		while (true) {
			System.out.println("1.로그인 2.종료");
			int cc = scn.nextInt();

			if (cc == 2) {
				break;
			} else if (cc == 1) {

				try {
					System.out.println("사원번호 입력");
					a = scn.nextInt();
					System.out.println("비밀번호 입력");
					a1 = scn.nextInt();
				} catch (Exception e) {
					System.out.println("숫자입력");
					scn.next();
				}
				TexEmp em = sere.log(a, a1);

				if (em == null) {
					System.out.println("사원번호,비밀번호가 틀림");

				} else {
					System.out.println("로그인");

					if (a == 1) {
						System.out.println("관리자 로그인");
						while (true) {
							System.out.println("메뉴선택 : 1.상품추가 2.수정 3.한건조회 4.상품출고 5.리스트 6.상품삭제 7.회원정보 9.이전");
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
								if (sert.getTexTile(b1) == null) {
									System.out.println("없는번호입니다.");

								}
								System.out.print("변경할 컬러");
								String b2 = scn.next();
								System.out.print("변경할 수량");
								int b3 = scn.nextInt();
								TexTile t = new TexTile(b1, null, b2, b3);
								Boolean qq = sert.modifyTexTile(t);
								if (qq) {
									System.out.println("수정완료");
								} else
									System.out.println("수정할 자료없음");
							} else if (b == 3) {
								System.out.println("조회할 오더번호");
								int b1 = scn.nextInt();
								TexTile t = sert.getTexTile(b1);
								if (t == null) {
									System.out.println("오더번호 잘못입력");
								} else if (t != null) {
									
									System.out.println(t.toString());
								}

							}else if(b==4) {
								int ch = 0;

								System.out.println("출고할 오더번호");
								ch = scn.nextInt();
								TexTile ch1 = sert.getTexTile(ch);
								if (ch1 == null) {
									System.out.println("오더번호 잘못입력");
								} else {
									System.out.println("출고 수량");
									int q = scn.nextInt();
									if(ch1.getTexam()<q) {
										System.out.println("수량이 부족합니다");
									}else {
										System.out.println("출고완료");
										sert.ma(ch1, q);
									}
									
								}
							}
							
							
							
							else if (b == 5) {
								List<TexTile> t = sert.textileList();
								for (TexTile t1 : t) {
									System.out.println(t1.toString());
								}
							} else if (b == 6) {
								System.out.print("삭제할 오더번호입력");
								int o = scn.nextInt();
								if (sert.getTexTile(o) == null) {
									System.out.println("삭제할 상품이없습니다");
								} else {
									sert.removeTx(o);
									System.out.println("삭제완료");
								}

							} else if (b == 7) {
								while (true) {
									System.out.println("1.직원리스트 2.직원조회 3.급여변경 4.삭제 5.이전");
									int b1 = scn.nextInt();
									if (b1 == 1) {
										List<TexEmp> t = sere.texemplist();
										for (TexEmp t1 : t) {
											System.out.println(t1.toString());
										}
									} else if (b1 == 2) {
										System.out.println("사원번호 입력");
										int emp = scn.nextInt();
										TexEmp t = sere.getTexEmp(emp);
										if (t == null) {
											System.out.println("없는 번호입니다");

										} else {
											System.out.println(t.toString());
										}

									} else if (b1 == 3) {
										System.out.println("사원번호 입력");
										int emp = scn.nextInt();

										System.out.print("변경급여");
										int e1 = scn.nextInt();
										TexEmp t = new TexEmp(emp, null, null, null, e1, null, 0);
										sere.modifyTexEmp(t);
									}

									else if (b1 == 4) {
										System.out.println("삭제할 직원번호 입력");
										int emp = scn.nextInt();
										if (sere.getTexEmp(emp) == null) {
											System.out.println("삭제할 직원번호가 없습니다.");
										} else {
											System.out.println("삭제완료");
											sere.removeTexEmp(emp);
										}
									} else if (b1 == 5) {
										break;
									}
								} // while 종료
							} else if (b == 9) {
								break;
							}
						}

					} else {
						System.out.println("직원 로그인");
						while (true) {
							System.out.println("메뉴선택 : 1.상품추가 2.수정 3.한건조회 4.리스트 5.삭제 6.출고 9.이전");
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
								TexTile aa = sert.getTexTile(b1);
								if (aa == null) {
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

							} else if (sa == 6) {

								int ch = 0;

								System.out.println("출고할 오더번호");
								ch = scn.nextInt();
								TexTile ch1 = sert.getTexTile(ch);
								if (ch1 == null) {
									System.out.println("오더번호 잘못입력");
								} else {
									System.out.println("출고 수량");
									int q = scn.nextInt();
									if(ch1.getTexam()<q) {
										System.out.println("수량이 부족합니다");
									}else {
										System.out.println("출고완료");
										sert.ma(ch1, q);
									}
									
								}

							} else if (sa == 9) {
								break;
							}
						}

					}
				} // 회원번호 1 아닐때
			}
		}
		System.out.println("종료");
		// end while

	} // end ex

}
