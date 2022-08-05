package com.study.step1;

import java.util.HashSet;


public class App {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");

    LinkedList<String> list2 = new LinkedList<>();
    list2.add("aaa");
    list2.add("bbb");
    list2.add("ccc");
    list2.add("ddd");

    Stack<String> list3 = new Stack<>();
    list3.push("aaa");
    list3.push("bbb");
    list3.push("ccc");
    list3.push("ddd");

    Queue<String> list4 = new Queue<>();
    list4.offer("aaa");
    list4.offer("bbb");
    list4.offer("ccc");
    list4.offer("ddd");

    HashSet<String> list5 = new HashSet<>();
    list5.add("aaa");
    list5.add("bbb");
    list5.add("ccc");
    list5.add("ddd");


    // 1) 각 자료구조에 값 꺼내기
    for(int i=0; i<list1.size();i++) {
      System.out.println(list1.get(i));
    }
    System.out.println("-------------------------------");

    for(int i=0; i<list2.size(); i++) {
      System.out.println(list2.get(i));
    }
    System.out.println("-------------------------------");

    for(int i=0; i < list3.size(); i++) {
      System.out.println(list3.pop());
    }
    System.out.println("-------------------------------");

    /* Stack은 list3.empty()를 이용해서 쓸 수도 있다.
      while(!list3.empty()) {
      System.out.println(list3.pop());
    }
     */

    for(int i=0; i<list4.size(); i++) {
      System.out.println(list4.poll());
    }
    System.out.println("-------------------------------");

    /* Queue도 list4.empty()를 이용해서 쓸 수도 있다.
     * while(!list4.empty){
     *  System.out.println(list4.poll());
     * }
     */

    //HashSet은 입력된 순서가 아니라 해시값의 오름차순으로 꺼낸다.
    String[] arr = list5.toArray(new String[0]);
    for(String s : arr) {
      System.out.println(s);
    }
    System.out.println("-------------------------------");


    // 문제점
    // - 자료 구조에 따라 데이터를 꺼내는 방식이 다르다!
    // - 데이터 조회에 일관성이 없다.
    // 
    // 해결책
    // - 데이터 조회하는 일을 별도의 객체에 맡기자!
    // - 단 데이터 조회 방식을 통일하기 위해 인터페이스로 조회 방식을 규격화 한다.

  }
}
