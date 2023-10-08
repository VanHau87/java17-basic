package com.javalang.staticbasic;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StaticInitializer {
	/*
	 * Static Initializer aka static initialization block
	 * là 1 khối code (a block of code) that's executed when a class is loaded into memory.
	 * it is EXECUTED ONLY ONCE when the class is loaded
	 * */
	/*
	 * được dùng trong 2 cases:
	 * - populating a data structure
	 * - initialization with error handling
	 * */
	static Map<String, String> mapInfo = new HashMap<>();
	//populate data
	static {
		mapInfo.put("Alice", "1123-2234-3345");
		mapInfo.put("Luffy", "4456-5567-6678");
	}
	/*
	 * Statics variables được khởi tạo (are initialized) khi the class they belong to is loaded into the memory
	 * by JVM, which is the first time the class is referenced in the program.
	 * this is slightly different from whenthe program starts
	 * */
	
	/*
	 * when the program starts: not all classes are immediately loaded. Only the class with 
	 * main method (the entry point) and its dependencies are loaded.
	 * */
	
	/**
	 * when a class is referenced: this is the key moment when static variables get initialized
	 * A class can be referenced in several ways:
	 * - use "new" keyword to create an instance of the class
	 * - a static method of class is invoked
	 * - access a static variable of a class
	 * */
	
	/**
	 * static initializer sẽ thực thi theo thứ từ trên xuống
	 * */
	static int num; //default 0
	static BigDecimal bigNum; //default null
	
	/* step by step */
	// Static variable with an initial value
    static String staticVar = "Initial Value"; //1
    static { //2
        System.out.println("Static initializer called.");
        staticVar = "Modified by static block";
    }
    
	public StaticInitializer() {//when new keyword is called
		System.out.println("Constructor called.");
	}
	public static void staticMethod() { //when it is called
        System.out.println("Static method called.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started.");
        System.out.println(staticVar);
        new StaticInitializer();
        staticMethod();
        
        String name = StaticMethods.employee.getName();
        System.out.println(name);
	}

}
