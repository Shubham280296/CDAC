package day9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		
		
		Class c = Class.forName("day9.Book");
		System.out.println(c.getName());
		
		Book b = new Book();
		c = b.getClass();
		System.out.println(c.getName());
		
		Field[] fields = c.getDeclaredFields();
		for(Field field:fields)
		{
			System.out.println(field.getName()+":"+field.getGenericType());
			if (field.getName()=="isbn")
			{
				field.setAccessible(true);
				field.set(b,147852);
				System.out.println(b);
			}
		}
		
		
		Constructor[] constructors = c.getConstructors();
		for (Constructor constructor:constructors)
		{
			System.out.println(constructor.getParameterCount());
			
		}
		
	}

}
