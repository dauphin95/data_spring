package com.kosa.myapp.rent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RentController {
	
	@Autowired
	IRentService rentService;
	
	@RequestMapping(value= {"/rent", "/rent/list"})
	public String getRentList(Model model) {
		List<RentVO> rentList = rentService.getRentList();
		model.addAttribute("rentList", rentList);
		return "rent/list";
	}
	
	@RequestMapping(value= "/rent{rentId}")
	public String getRentInfo(@PathVariable int rentId, Model model) {
		RentVO rent = rentService.getRentInfo(rentId);
		model.addAttribute("rent", rent);
		return "/rent";
	}
	
	@RequestMapping(value= "/rent/insert", method=RequestMethod.GET)
	public String insertRent(Model model) {
		model.addAttribute("bookList", rentService.getAllBookId());
		model.addAttribute("userList", rentService.getAllUserId());
		return "rent/insertform";
	}
	
	@RequestMapping(value= "/rent/insert", method=RequestMethod.POST)
	public String insertRent(RentVO rent) {
		rentService.insertRentInfo(rent);
		return "redirect:/rent";
	}
	
	@RequestMapping(value= "/rent/update", method=RequestMethod.GET)
	public String updateRent(int rentid, Model model) {
		model.addAttribute("rent", rentService.getRentInfo(rentid));
		model.addAttribute("bookList", rentService.getAllBookId());
		model.addAttribute("userList", rentService.getAllUserId());
		return "rent/updateform";
		
	}
	
	@RequestMapping(value= "/rent/update", method=RequestMethod.POST)
	public String updateRent(RentVO rent, Model model) {
		rentService.updateRentInfo(rent);
		return "redirect:/rent/"+rent.getRentId();
	}
	
	@RequestMapping(value="/rent/delete", method=RequestMethod.GET)
	public String deleteRent(int rentid, Model model) {
		model.addAttribute("rent", rentService.getRentInfo(rentid));
		return "delete/form";
	}
	
	@RequestMapping(value="/rent/delete", method=RequestMethod.POST)
	public String deleteRent(int rentid, int userid) {
		rentService.deleteRentInfo(rentid, userid);
		return "redirect:/rent";
	}

}
