package com.yedam.java.test04;

public class Work {
	
	
		//필드
		private static int serialNum = 0;
		
		private int workNo;            //번호
		private String workContent;    //할일
		private boolean complete;      //완료여부
		
		
		//생성자
		public Work(String workContent) {
			serialNum++;
			this.workNo = serialNum;
			this.workContent = workContent;
			this.complete = false;
		}
		
		
		public static int getSerialNum() {
			return serialNum;
		}
		public static void setSerialNum(int serialNum) {
			Work.serialNum = serialNum;
		}
		public int getWorkNo() {
			return workNo;
		}
		public void setWorkNo(int workNo) {
			this.workNo = workNo;
		}
		public String getWorkContent() {
			return workContent;
		}
		public void setWorkContent(String workContent) {
			
			this.workContent = workContent;
		}
		public boolean isComplete() {
			return complete;
		}
		public void setComplete(boolean complete) {
			this.complete = complete;
		}      
	
		
		
		
		
}
