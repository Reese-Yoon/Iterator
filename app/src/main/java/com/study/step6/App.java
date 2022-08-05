package com.study.step6;

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

    HashSet<String> list5 = new HashSet<String>();
    list5.add("aaa");
    list5.add("bbb");
    list5.add("ccc");
    list5.add("ddd");


    // 1) 각 자료구조에 값 꺼내기
    // => ArrayList에게 값을 꺼내는 일을 할 객체를 달라고 요구한다.
    Iterator<String> iterator1 = list1.iterator();
    while(!iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }
    System.out.println("-----------------------------");

    Iterator<String> iterator2 = list2.iterator();
    while(!iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
    System.out.println("------------------------------");

    Iterator<String> iterator3 = list3.iterator();
    while(!iterator3.hasNext()) {
      System.out.println(iterator3.next());
    }
    System.out.println("------------------------------");


    Iterator<String> iterator4 = list4.iterator();
    while(!iterator4.hasNext()) {
      System.out.println(iterator4.next());
    }
    System.out.println("------------------------------");

    java.util.Iterator<String> iterator5 = list5.iterator();
    while(iterator5.hasNext()) {
      System.out.println(iterator5.next());
    }
    System.out.println("------------------------------");


    // 문제점
    // - 자료 구조에 따라 데이터를 꺼내는 방식이 다르다!
    // - 데이터 조회에 일관성이 없다.
    // 
    // 해결책
    // - 데이터 조회하는 일을 별도의 객체에 맡기자!
    // - 단 데이터 조회 방식을 통일하기 위해 인터페이스로 조회 방식을 규격화 한다.
    // - 각 Iterator 클래스를 그 Iterator를 생성하는 클래스 안으로 넣어서 쓸데없는 노출을 막는다.
    // - 외부의 객체는 Iterator 인터페이스 규칙에 따라 사용할 수 있어 중첩 클래스로 만들어도 괜찮다.

  }
}
