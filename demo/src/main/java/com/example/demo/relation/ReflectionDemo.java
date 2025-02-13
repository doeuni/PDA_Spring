package com.example.demo.relation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object computer = new Computer();//Computer 객체를 생성해서 Object 타입 변수에 저장
        //1 Object를 Computer로변경
        //2 컴퓨터 정보를 가져온다.
        Class computerClass = Computer.class;
        Method computerMethod = computerClass.getMethod("turnOn");//computerClass에서 "turnOn"이라는 이름의 메소드 정보를 가져옴
        computerMethod.invoke(computer, null) ; //invoke는 호출하다부른다는뜻. 메서드입장에서 .역으로.
  //  computer.turnOn();
    }

}

class Computer {
    Computer() {

    }
    public void turnOn(){
        System.out.println("사랑해요 LG");

    }


}

class NoteBook extends Computer{
    NoteBook() {
        // (부모 생성자 호출하는게 생략) aor매개변수가 필요할 떈 super 생략불가능.
        super();
    }
}