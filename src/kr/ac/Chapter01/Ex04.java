package kr.ac.Chapter01;

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

    public void solution(int num){
        String[] arr = new String[num];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < num ; i ++){
            System.out.print("문자열 입력 : ");
             String str = sc.nextLine();
             String reverse = "";
             for (int j = str.length() - 1; j >= 0; j--) {
                 reverse = reverse + str.charAt(j);
             }
            arr[i] = reverse;
        }
        for(String x : arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Ex04 e = new Ex04();
        e.solution(num);
    }

}
