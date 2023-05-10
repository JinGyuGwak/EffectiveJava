package org.example.item01;

//아이템 1 : 생성자 대신 정적 팩터리 메서드를 고려하라
public class Foo {

    String name;
    String address;
    public Foo(){}
    public Foo(String name){
        this.name = name;
    }
    private static final String abc11 = "나는바보";

    private static final Foo test = new Foo();

    public static Foo getFoo(){
        return test;
    }

    public static Foo withName(String name){
        return new Foo(name);
    }

    public static Foo withAddress(String address){
        Foo foo = new Foo();
        foo.address=address;
        return foo;
    }


    public static void main(String[] args) {
        Foo foo1 = new Foo("jingyu");
        Foo foo2 = Foo.withName("Jingyu");
        Foo foo3 = Foo.getFoo();
    }
}
