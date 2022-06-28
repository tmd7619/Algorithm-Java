package kr.ac.Chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {


    /**
     * . 단어 뒤집기
     * 설명
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     *
     * 입력
     * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
     *
     */

    public ArrayList<String> solution(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x :str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public ArrayList<String> solution2(int n , String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x :str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
            String tmp = String.valueOf(s); // valueOf는 static 메서드라 클래스.함수 접근 가능
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        Ex04 e = new Ex04();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i = 0; i<num ; i ++){
            str[i] = sc.next();
        }
        for(String x :e.solution(num, str)){
            System.out.println(x);
        }

    }

}
