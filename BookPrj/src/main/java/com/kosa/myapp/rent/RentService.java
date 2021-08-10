package com.kosa.myapp.rent;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RentService implements IRentService {
	
	@Autowired
	@Qualifier("IRentRepository")
	IRentRepository rentRepository;

	@Override
	public List<RentVO> getRentList() {
		return rentRepository.getRentList();
	}

	@Override
	public RentVO getRentInfo(int rentid) {
		return rentRepository.getRentInfo(rentid);
	}

	@Override
	public void insertRentInfo(RentVO rent) {
		rentRepository.insertRentInfo(rent);

	}

	@Override
	public void updateRentInfo(RentVO rent) {
		rentRepository.updateRentInfo(rent);

	}

	@Override
	public void deleteRentInfo(int rentid, int userid) {
		rentRepository.deleteRentInfo(rentid, userid);

	}

	@Override
	public List<Map<String, Object>> getAllBookId() {
		return rentRepository.getAllBookId();
	}

	@Override
	public List<Map<String, Object>> getAllUserId() {
		return rentRepository.getAllUserId();
	}

}
