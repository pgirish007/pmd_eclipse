public class Test {
 public static void main(String[] args) {
  method(null);
 }
 public static void method(Object o) {
  System.out.println("Object method");
 }
 public static void method(String s) {
  System.out.println("String method");
 }

}

*****


public class NullCheckMain {
 
    public static void main(String[] args) {
        Integer i = new Integer(null);
        String s = new String(null);
    }
}

*****


public class TestMethod {

	public static void main(String[] args) {
		TestMethod t = new ChildClass();
		t.test();
	}
	
	public static void test() {
		System.out.println("In parent static method");
	}
}

class ChildClass extends TestMethod {

	public static void test() {
		System.out.println("In Child static method");

	}
}




*****



public class TestMethod {

	public static void main(String[] args) {
	       String str1="Java2blog";
	        String str2=new String(str1);
	        System.out.println(str1==str2);
	        System.out.println(str1.equals(str2));
	}
}



*****



public class Test{
public static void main(String[] args){
  Integer num1 = 100;
  Integer num2 = 100;
  if(num1==num2){
   System.out.println("num1 == num2");
  }
  else{
   System.out.println("num1 != num2");
  }
 }
}

*****

Q3 — How does Garbage Collection prevent a Java application from going out of memory?
Answer
Java Garbage Collector does not prevent a Java application from going out of memory. It simply cleans the unused memory when an object is out of scope and no longer needed. As a result, garbage collection is not guaranteed to prevent a Java app from going out of memory.
*****


Q4 — Is Java “pass-by-reference” or “pass-by-value”?
Answer
Java is always “pass-by-value”. However, when we pass the value of an object, we pass the reference to it because the variables store the object reference, not the object itself. But this isn’t “pass-by-reference.” This could be confusing for beginners.

*****

public class Test{
 public static void main(String[] args){
   String s = new String("Hello World");
 }
}

*****

public class Test{
 public static void main(String[] arr){
    System.out.println(0.1*3 == 0.3);
    System.out.println(0.1*2 == 0.2);
 }
}

*****

public class Test{ 
 public static void main(String[] args){ 
  System.out.println("main method");
 } 
 public static void main(String args){ 
  System.out.println("Overloaded main method");
 } 
}

*****


public class TestMethod {

	public static void main(String[] args) {
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}
}




*****
public class MethodOverrdingTestMain { 
 public static void main(String[] args) {
   A a= new B();
   a.method2();
 }
}
class A{
 
 public void method1()
 {
   System.out.println("Method1 in class A");
 }
}
class B extends A{
    public void method1()
     {
       System.out.println("Method1 in class B");
     }
    public void method2()
     {
       System.out.println("Method2 in class B");
     }
}

*****




