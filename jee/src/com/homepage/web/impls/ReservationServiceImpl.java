package com.homepage.web.impls;

 
import java.util.Scanner;

import com.homepage.web.service.ReservationService;
 
public class ReservationServiceImpl implements ReservationService{
    

    public static String[][] seat = new String[3][5]; // 좌석위치값
    
    /*
     * 좌석위치값이 DB에 저장될 필요 없다..
     * 하지만 예약번호가 생성되면 좌석위치값+ 예약시간+ 예약자가 맵핑될 필요가 있다
     * 따라서 예약번호는 좌석 위치값+ 예약시간 + 예약자의 아이디 정도로 생성 시키면
     * 나중에 디비에서 불러와서 좌석 위치값 예약시간 예약자를 알아보고자 할때
     * 서브 스트링 같은 메소드를 확용하면 쉽게 얻을 수 있을 것이다.. 
     */
    
	
	@Override
	public String checkIn(int floor, int row, String id) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
        String ro, fl, guestName;*/
			String msg="";
        
            try {
 
               
                if (floor == 0){
                	
                }
               
                if (row == 0){}
                     // 0 이 넘어왔다면 while 문으로 돌아가 입력을 다시 받는다
 
                if (seat[floor - 1][row - 1] != null) { // 이미 이름이 있다면(예약중)
                    msg="\n!!! 그 방은 이미 예약중입니다 !!!";
                    // 입실하지 않고, 입력을 다시받는다.
                } else {
                    // 이름이 없다면 checkIn 시킨다.
               
                    seat[floor - 1][row - 1] = id;
 
                   
                    msg=id+"님 체크인이 완료되었습니다.";
 
                }
            } catch (Exception ex) {
               System.out.println("리저베이션서비스 임플에서 체크인 메서드에서 에러 발생");
            }
 
     
        

		return msg;
	}
	@Override
	public String checkOut(int floor, int row, String id) {
		// TODO Auto-generated method stub
		 String msg="";
	       
	            try {
	 
	                msg="몇층에서 퇴실? ";
	                //floor = sc.nextLine();
	                //floor = this.inputCheck(floor, 1, 3);
	                if (floor == 0){}
	                     // 0 이 넘어왔다면 입력을 다시 받는다
	 
	                msg="몇호에서 퇴실? ";
	                //row = sc.nextLine();
	                //room = this.inputCheck(row, 1, 5);
	                if (row == 0)
	                {} // 0 이 넘어왔다면 입력을 다시 받는다
	 
	                if (seat[floor - 1][row - 1] == null) { // 방에 이름이 없다면..
	                    msg="\n!!! 그 방은 이미 빈방입니다 !!!"; // 이미 빈방입니다 메세지
	                     // 퇴실처리 다시
	                } else {
	                    id = seat[floor - 1][row - 1]; // 방에 이름이 있다면 해당 배열주소
	                                                            // null처리
	                    seat[floor - 1][row - 1] = null;
	 
	                    msg=id + "님 checkOut 완료 되셨습니다";
	                    
	 
	                }
	            } catch (Exception ex) {
	            	System.out.println("리저베이션서비스 임플에서 체크아웃 메서드에서 에러 발생");
	            }
	 
	   
	            return msg;
	}
	
	@Override
	public String[][] showStatus() {
		// TODO Auto-generated method stub
		 /*System.out.println("\n\n\t***************  호텔의 투숙상태 *****************");
	        // 중첩for if문
	        for (int i = 0; i < seat.length; i++) {
	            for (int j = 0; j < seat[i].length; j++) {
	                if (seat[i][j] == null) {
	                    System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
	                            + " □\t" + "\t");
	                } else {
	                    System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
	                            + " ■\t" + seat[i][j] + "\t");
	                }
	            }
	            System.out.println();
	        }*/
	        
	        return seat;
	}
	@Override
	public void process() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
        int sel = 0;
        String input;
 
        /*while (true) {
            this.showStatus(); // 체크인 상태를 무조건 보면서 입실퇴실
 
            try {
                System.out.print("1.투숙  2.퇴실  3.전체보기  4.종료? ");
                input = sc.nextLine();
 
                sel = this.inputCheck(input, 1, 4);
            } catch (Exception ex) {
                alertMsg(1); // 숫자만입력하세요
            }
 
            switch (sel) {
            case 1:
//                this.checkIn();
                break; // 체크인
            case 2:
               // this.checkOut(int floor, int row, String id);
                break; // 체크아웃
            case 3:
                this.process();
                break; // 현황보기
            case 4:
                alertMsg(9);
                System.exit(1); // 프로그램을 종료합니다.
 
            }
 
        } // while end
*/        
    }
 

}
    

 

