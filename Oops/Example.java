class ObjectExample {
    void fun1( )// instance(object ) member variable
    {
        System.out.println("this is fun1 of objectexample");
    }
    void fun2(){
        System.out.println("this is fun2 of objectexample");
    }
    void fun3(){
        System.out.println("this is fun3 of objectexample");
    }
}

// this is outside class
class InnerExample {

    static void fun1( ){
        System.out.println("this is fun1");
    }
    static void fun2( ){
         System.out.println("this is fun 2");
    }
    static void fun3( ){
        System.out.println("this is fun 3");
    }
}

// main class 
public class Example {
   static void fun1( ){
        System.out.println("this is fun1");
    }
   static void fun2( ){
         System.out.println("this is fun 2");
    }
   static void fun3( ){
        System.out.println("this is fun 3");
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        fun1();
        fun2();
        fun3();
        InnerExample.fun1();
        InnerExample.fun2();
        InnerExample.fun3();

        ObjectExample obj = new ObjectExample();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}
