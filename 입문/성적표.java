import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
<문제>

시험 점수를 입력받아 90 ~ 100점은 A,
 80 ~ 89점은 B, 70 ~ 79점은 C,
60 ~ 69점은 D, 나머지 점수는 F를
출력하는 프로그램을 작성하시오.

 

<입력>
학생이름과 시험점수(국어, 영어,수학)를 입력한다.
시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

 

<출력>

시험 성적을 출력한다.
*********************************
이름 국어 영어 수학 총점 평균 성적
*********************************
홍길동 90 90 90 270 90 A
*********************************
**/
public class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        System.out.println(solution.solution());
    }
    public String solution(){
        String title = " ### 성적표 ### \n";
        String name = "";
        int ko = 0;
        int en = 0;
        int ma = 0;
        int total = 0;
        float avg = 0.0f;
        String grade = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력: ");
        name = scanner.next();
        System.out.println("국어점수 입력: ");
        int input = scanner.nextInt();
        while(!(input <= 100 && input >= 0)){ko = input; break;}
        System.out.println("영어점수 입력: ");
        input = scanner.nextInt();
        while(!(input <= 100 && input >= 0)){en = input; break;}
        System.out.println("수학점수 입력: ");
        input = scanner.nextInt();
        while(!(input <= 100 && input >= 0)){ma = input; break;}
        total = ko + en + ma;
        avg = total / 3;
        if(avg >= 90){grade = "A";}
        else if (avg >= 80){grade = "B";}
        else if (avg >= 70){grade = "C";}
        else if (avg >= 60){grade = "D";}
        else if (avg >= 50){grade = "E";}
        else{grade = "F";}
        String answer = String.format("*********************************\n"
        +"이름 국어 영어 수학 총점 평균 성적\n"
        +"*********************************\n"
        +"%s %d %d %d %d %.1f %s\n"
        +"*********************************\n", name, ko, en, ma, total, avg, grade);
        return title + answer;

    }
    
}
