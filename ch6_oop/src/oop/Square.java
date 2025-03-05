package oop;

public class Square {
    // 정사각형
    // 속성 : 길이(sideLength)
    int sideLength;

    // 기능 : 면적 구하기
    int getArea() {
        return sideLength * sideLength;
    }

    // 생성자
    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // toString
    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

}
