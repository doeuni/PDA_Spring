package com.example.demo.relation;

public interface RelationRepository {
    //dkf아래메서드가지고있지않으면 뒤에 구현체 메서드를 쓸수가없다 .이걸 쓸수있게 열어준거 !!
    void saveChild(Child child) ;
    void saveParent(Parent parent);
    //entityManger가 db랑 소통함.

    //child1의 정보를 parent이름 포함해서 출력 (Select)
    Child findChild() ;
}
