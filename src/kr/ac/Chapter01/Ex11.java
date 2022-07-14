package kr.ac.Chapter01;

import java.util.Scanner;

public class Ex11 {

    /**
     * 설명
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     * 단 반복횟수가 1인 경우 생략합니다.
     *
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     *
     *
     * 출력
     * 첫 줄에 압축된 문자열을 출력한다.
     *
     * String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
     * toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
     *
     */

    public String solution(String str){
        str = str +" ";
        String answer = "";
        int cnt = 1 ;
        for(int i = 0; i <str.length()-1; i ++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt ++;
            } else {
                answer += str.charAt(i);
                if(cnt >1 ){
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Ex11 e = new Ex11();

        System.out.println(e.solution(str));

    }
}
