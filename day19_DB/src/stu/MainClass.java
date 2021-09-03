package stu;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
   public static void main(String[] args)  {
   		Scanner scanner = new Scanner(System.in);
       DBclass db = new DBclass();
       Scanner input = new Scanner(System.in);
       int num;
       while(true) {
          System.out.println("1.등록 2.전체보기 3.삭제 4.수정");
          num = input.nextInt();
          switch(num) {
          case 1:
             System.out.println("학번 입력");
             String stNum = input.next();
             System.out.println("이름 입력");
             String name = input.next();
             System.out.println("나이 입력");
             int age = input.nextInt();
             
             //int result = db.saveData(stNum, name, age);
             int result = db.saveData2(stNum, name, age);
             if(result == 1) {
                     System.out.println("성공적으로 저장");
             }else {
                     System.out.println("동일한 아이디가 존재합니다");
             }
             break;
          case 2:
          	ArrayList<StudentDTO> list = db.getUsers();
          	if(list.size()==0) {
          		System.out.println("저장된 데이터가 없습니다");
          	}else {
          		for(int i=0;i<list.size();i++) {
          			System.out.println("학번 : "+list.get(i).getStNum());
          			System.out.println("이름 : "+list.get(i).getName());
          			System.out.println("나이 : "+list.get(i).getAge());
          			System.out.println("---------------------------");
          		}
          	}
          	break;
          case 3:
          	String userNum = scanner.next();
          	int re = db.delete(userNum);
          	if() {
          		
          	}
          	break;
          case 4:
          	
          	break;
          }
           }
   }
}



