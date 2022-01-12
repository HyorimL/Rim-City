package com.yedam.java.app.emp13;

import java.util.List;
import java.util.Scanner;

public class Emp13App {

	public static void main(String[] args) {


		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Emp13DAO dao = Emp13DAO.getInstance();
		
		Emp13 emp13 = null;
		int employeeId = 0;
		
		while(run) {
			System.out.println();
			System.out.println("=== 1.등록  2.수정  3.삭제  4.사원조회  5.전체조회  9.종료 ===");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(scanner.nextLine());
			
			switch(menuNo) {
				
			case 1:
				
				emp13 = new Emp13();
				System.out.print("사원번호>");
				emp13.setEmployeeId(Integer.parseInt(scanner.nextLine()));
				System.out.print("사원이름>");
				emp13.setFirstName(scanner.nextLine());
				System.out.print("직급>");
				emp13.setJobId(scanner.nextLine());
				System.out.print("연봉>");
				emp13.setSalary(Integer.parseInt(scanner.nextLine()));
				System.out.print("상여>");
				emp13.setCommissionPct(scanner.nextLine());
				System.out.print("부서이름>");
				emp13.setDepartmentName(scanner.nextLine());
				System.out.print("지역번호>");
				emp13.setLocationId(Integer.parseInt(scanner.nextLine()));

				
				dao.insert(emp13);
				
				break;

			case 2:
				
				emp13 = new Emp13();
				System.out.print("사원번호>");
				emp13.setEmployeeId(Integer.parseInt(scanner.nextLine()));
				System.out.print("사원이름>");
				emp13.setFirstName(scanner.nextLine());
				
				dao.update(emp13);
				
				break;
			
			case 3:
				
				System.out.print("사원번호>");
				employeeId = Integer.parseInt(scanner.nextLine());
				
				dao.delete(employeeId);
				
				break;
			
			case 4:
				
				System.out.print("사원번호>");
				employeeId = Integer.parseInt(scanner.nextLine());
				emp13 = dao.selectOne(employeeId);
				System.out.println(emp13);
				
				break;
			
			case 5:
				
				List<Emp13> list = dao.selectAll();
				for(Emp13 emp : list) {
					System.out.println(emp);
				}
				
				break;
			
			case 9:
				
				run = false;
				System.out.println("프로그램 종료");
				
				break;
				
			}
		}
		
		
		
		
	}

}
