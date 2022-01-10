package com.yedam.java.test04;

public class ToDo {
	
	
	//필드
		private static int serialNum = 0;
		
		private int todoNo;         //할일번호
		private String todoWhat;    //할일
	
		
		
		
		
		//생성자
		public ToDo(String todoWhat) {
			serialNum++;
			this.todoNo = serialNum;
			this.todoWhat = todoWhat;
			this.complete = false;
		}





		public static int getSerialNum() {
			return serialNum;
		}





		public static void setSerialNum(int serialNum) {
			ToDo.serialNum = serialNum;
		}





		public int getTodoNo() {
			return todoNo;
		}





		public void setTodoNo(int todoNo) {
			this.todoNo = todoNo;
		}





		public String getTodoWhat() {
			return todoWhat;
		}





		public void setTodoWhat(String todoWhat) {
			this.todoWhat = todoWhat;
		}
		
		public boolean isComplete() {
			return complete;
		}
		public void setComplete(boolean complete) {
			this.complete = complete;
		}
		private boolean complete; 
		
		}
