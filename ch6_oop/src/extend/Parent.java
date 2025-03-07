package extend;

// 상속(isa 관계)
// 기존의 클래스를 재사용하여 새로운 클래스 작성
// 장점
// 적은 양의 코드로 새로운 클래스 작성 가능
// 코드를 공통적으로 관리가능 -> 코드의 추가 및 변경 용이
// 단일 상속만 허용
// class Child extends Parent, Tv (X)

// Object 클래스 : 모든 클래스의 조상
// 자동적으로 무조건 Object 클래스를 상속받음

// 조상 클래스 : 부모, super, 상위, 기반(base)
// 자손 클래스 : 자식, sub, 하위, 파생(derived)

public class Parent {
    int age;
}
