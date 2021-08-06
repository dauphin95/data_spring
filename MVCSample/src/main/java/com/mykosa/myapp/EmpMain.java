package com.mykosa.myapp;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		IEmpService empService = context.getBean("empService", IEmpService.class);
		
		
		//전체사원수
		System.out.println("전체 사원의 수:" + empService.getEmpCount());
		System.out.println();
		
		
		//선택한 부서의 전체사원수
		System.out.println("선택하신 부서의 전체 사원 수 :" + empService.getEmpCount(50));
		System.out.println();
		
		
		//전체 사원 정보 출력
		System.out.println("전체 사원:");
//		System.out.println(empService.getEmpList());  아래는 줄바꿈 출력
		List<EmpVO> empList = empService.getEmpList();
		for(EmpVO emp : empList) {
			System.out.println(emp);
		}
		System.out.println();
		
		
		//선택한 사원의 정보 출력
		System.out.println("103원 사원의 정보 조회 : \n" + empService.getEmpInfo(103));
		System.out.println();
		
		
		//새로운 사원 입력
		System.out.println("새로운 사원의 정보 입력:");
		EmpVO emp = new EmpVO();
		emp.setEmployeeId(300);
		emp.setFirstName("dauphin");
		emp.setLastName("lee");
		emp.setEmail("dabin95@naver.com");
		emp.setPhoneNumber("010-7572-3556");
		emp.setJobId("IT_PROG");
		emp.setSalary(8000);
		emp.setCommissionPct(0.2);
		emp.setManagerId(100);
		emp.setDepartmentId(20);
		try {
			empService.insertEmp(emp);
			System.out.println("입력이 완료되었습니다");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		
		//새로운 사원 정보 출력
		EmpVO emp300 = empService.getEmpInfo(300);
		System.out.println("300번 신규 사원 정보 출력 : \n" + emp300);
		System.out.println();
		
		
		//사원 정보 수정
		System.out.println("300번 사원 급여 수정:" );
		emp300.setSalary(10000);
		try { 
			empService.updateEmp(emp300);
			System.out.println("수정이 완료되었습니다");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());  //하루 2번 직무이력 변경 X
		}
		System.out.println("300번 사원  수정정보 출력 :\n");
		System.out.println(emp300);
		System.out.println();
		
		
		//사원 정보 삭제 (직무이력 -> 전체 정보 삭제 순)
		try{
			empService.deleteEmp(300, "dabin95@naver.com");
			System.out.println("삭제가 완료되었습니다");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		
		//삭제된 사원 정보 조회
		try {
			System.out.println(empService.getEmpInfo(300));
		}catch (RuntimeException e) {
			System.out.println("선택된 사원 없음");
		}
		System.out.println();
		
		
		// 모든 부서번호, 부서 이름 출력
		System.out.println("모든 부서번호와 부서이름 출력:\n" + empService.getAllDeptId());
		System.out.println();
		
		
		//모든 직무 아이디, 타이틀 출력  (+ 직무 아이디만 출력)
		System.out.println("모든 직무아이디와 직무타이틀 출력 :\n" + empService.getAllJobId());
		List<Map<String, Object>> jobInfo = empService.getAllJobId();
		for(Map<String, Object> jobID : jobInfo ) {
			System.out.println(jobID.get("JOB_TITLE"));
		}
		System.out.println();
		
		
		//모든 매니저 번호, 아이디 출력
		System.out.println("모든 매니저번호와 매니저아이디를 출력 :\n" + empService.getAllManagerId());
		
		
		
		context.close();

	}

}
