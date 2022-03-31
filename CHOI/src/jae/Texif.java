package jae;

import java.util.List;

public interface Texif {
	public void insertTextile(Textile textile); //입력
	public Textile getTex(int sno); //한건조회
	public List<Textile> textile();//전체목록
	public void modifyStudent(Textile textile);//한건수정
	public void removest(int a);//한건삭제
	public List<Textile> searchTextile(String name); //이름조회
}
