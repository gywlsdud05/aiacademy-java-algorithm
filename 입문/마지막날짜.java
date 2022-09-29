

import java.util.Scanner;

/** 년과 월을 입력받아서,

출력하는 예는 다음과 같다.

******************
년 월 일
******************
2000 2 28
******************
**/

class 마지막날짜 {
    public static void main(String[] args) {
        마지막날짜 solution = new 마지막날짜();
        System.out.println(solution.solution());
    }
    public String solution(){
        String title ="마지막날짜\n";
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month =0;
        int day = 0;
        System.out.println("년을 입력: ");
        year = scanner.nextInt();
        System.out.println("월을 입력: ");
        year = scanner.nextInt();
        switch(month){
            case 2: day = 28; break;
            case 4: case 6: case 9: case 11: day = 28; break;
            case 1: case 3: case 5: case 8: case 10:
            case 12: day = 31; break;
            
        }
        String answer = String.format(
        "******************\n"
        +"년 월 일/n"
        +"******************\n"
        +"%d %d %d/n"
        +"******************\n", year, month, day);
        return title + answer;
    }
}
