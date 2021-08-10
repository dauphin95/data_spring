package com.kosa.myapp.rent;

import java.util.List;
import java.util.Map;

public interface IRentService {
	List<RentVO> getRentList(); // 모든 대출 정보 출력
	RentVO getRentInfo(int rentid); // 지정 책 대출 정보 출력
	void insertRentInfo(RentVO rent); // 대출 정보 입력
	void updateRentInfo(RentVO rent); // 대출 정보 수정
	void deleteRentInfo(int rentid, int userid); // 대출 정보 삭제
	List<Map<String, Object>> getAllBookId();
	List<Map<String, Object>> getAllUserId();


}
