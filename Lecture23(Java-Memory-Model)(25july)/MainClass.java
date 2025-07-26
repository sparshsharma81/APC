package Java_memory_model_25_07;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		  Class c= s.getClass();
		  
		  System.out.println(c);
		   Method[] m=c.getMethods();
//		   for(int i=0;i<m.length;i++)
//		   {
//			   System.out.println(m[i]);
//		   }
		   
		   Field[] f= c.getDeclaredFields();
		   
		   for(int i=0;i<f.length;i++)
		   {
			   System.out.println(f[i]);
		   }
	}  

}