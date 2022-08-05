## Iterator 실습

- 1. 클래스 정의
  - 1) ArrayList, LinkedList, Queue, Stack, HashCode 등의 자료구조 파일을 만듬
  - 2) 각 자료구조의 값을 꺼내기.

- 2. 패키지 멤버로 Iterator 클래스 정의
  - 1) 인터페이스 Iterator를 만듬.
  - 2) ArrayList, LinkedList, Queue, Stack, HashCode 등의 Itrator 코드를 만듬
      - 꼭 인터페이스에 있는 메서드들을 오버라이딩(재정의)해서 구현부를 작성해줘야함.
  - 3) ArrayList, LinkedList, Queue, Stack, HashCode에 Iterator메서드를 추가한다. 
  - 4) App 코드를 Interator에 맞게 변경한다.

- 3. 클래스 멤버(스태틱 중첩 클래스)로 Iterator클래스 정의하기
  - 1) 메인 메소드가 있는 app에 Iterator 인스턴스를 생성하게하여 수정한다. 
  - 2) ArrayListIterator내용을  ArrayList안으로 넣어둔다.

- 4.  인스턴스 멤버(논스태틱 중첩 클래스 = 이너클래스)로  Iterator 클래스로 정의하기
  - 1) 클래스 멤버(스태틱 중첩 클래스)에서 static을 제외하면 인스턴스 멤버(논스태틱 중첩 클래스)가 된다.
  - 2) 인스턴스 멤버는 인스턴스 주소를 받은 필드와 생성자 파라미터가 자동으로 추가됨.
  - 3) 바깥 클래스의 인스턴스 주소를 담고 있는 변수를 사용하려면 
        => 바깥클래스명. this. 멤버

- 5. 로컬 클래스로 Iterator 클래스 정의하기
  - 1) Iterator구현체 안에 인스턴스 클래스 안에 넣어라.