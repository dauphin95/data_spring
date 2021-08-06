package com.mykosa.myapp;

import java.util.List;
import java.util.Map;

public interface IEmpService {

	int getEmpCount();   //모든 사원의 수 조회
	int getEmpCount(int deptid);    //지정한 부서의 사원 수 조회
	List<EmpVO> getEmpList();    //모든 사원의 정보 조회
	EmpVO getEmpInfo(int empid);   //지정한 사원의 모든 정보 조회
	void updateEmp(EmpVO emp);   //지정한 사원의 정보 수정
	void insertEmp(EmpVO emp);   //새로운 사원의 정보 입력
	void deleteEmp(int empid, String email);  //사원의 정보 삭제
	List<Map<String, Object>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
	
}
