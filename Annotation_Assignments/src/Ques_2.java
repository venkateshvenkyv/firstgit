

public class Ques_2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i=new Information("extra info");
		Class c = i.getClass();
		java.lang.annotation.Annotation an=c.getAnnotation(Question_2.class);
		Question_2 in=( Question_2)an;
		System.out.println(in.Date());
		System.out.println(in.AuthorID());
		System.out.println(in.Time());
		System.out.println(in.version());
		
	}

}
@ Question_2(name=" Venkatesh ",version=9,AuthorID=1532,Author="kirtikalambe",Date="03/01/1945",Time="12:30")
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
 