import java.lang.annotation. *;
import java.lang.reflect.*;

public class Question_3 {
	public static void main(String[] args) throws Exception {
		MyClass myclass=new MyClass();
		myclass.myMethod1();
		myclass.myMethod2();
		myclass.myMethod3();
		Class c=myclass.getClass();
		Method m=c.getDeclaredMethod("myMethod1");
		Method m1=c.getDeclaredMethod("myMethod2");
		Method m2=c.getDeclaredMethod("myMethod3");
		Annotation ann=m.getAnnotation(Execute.class);
		Annotation ann1=m1.getAnnotation(Execute.class);
		Annotation ann2=m2.getAnnotation(Execute.class);
	Execute e=(Execute)ann;
	Execute e1=(Execute)ann1;
	Execute e2=(Execute)ann2;
	System.out.println(e.sequence());
	System.out.println(e1.sequence());
	System.out.println(e2.sequence());
	
	}
}
