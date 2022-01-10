package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Homework.Book;

public class ToDoList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<ToDo> list = new ArrayList<>();
		String todoWhat = null;
		
		boolean run = true;

		while(run) {
		
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3.할일조회 | 4.할일완료 | 5.종료");
		    System.out.println("선택>");
		    int menuNo = Integer.parseInt(scanner.nextLine());

		    switch(menuNo) {
		    
		    case 1 :
		    	
		    	System.out.print("할 일> ");
		    	todoWhat = scanner.nextLine();
		    	todo = new Todo(todoWhat);
		    	list.add(todo);
		    	
		    	break;
		    	
		    	
		    case 2 : 
		    	for(ToDo todoTemp : list) {
	    			  
	    			  
	    			  System.out.println(todoTemp.getTodoNo()
	    					  + " " + todoTemp.getTodoWhat() 
	    					  + " " + (todoTemp.isComplete() ? "완료" : "미완료"));
	    		  }
		    
		    	break;
		    	
		    	
		    case 3 : 
		    	
		    	
		    	
		    	break;
		    	
		    	
		    	
		    case 4 :
		    	
		    	
		    	break;
		    	
		    	
		    case 5 :
		    	run = false;
		    	System.out.println("프로그램을 종료합니다.");
		    	break;
		    	
		    	
		    }
		
		}

	}

}
