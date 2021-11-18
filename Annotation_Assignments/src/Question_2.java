 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Question_2 {

	String name();
	String supervisor()default "Manager";
	int version();
	int AuthorID();
	String Author() default "Hello";
	String Date();
	String Time();
	String desp() default "HELLO MANAGER";
	
}
 
