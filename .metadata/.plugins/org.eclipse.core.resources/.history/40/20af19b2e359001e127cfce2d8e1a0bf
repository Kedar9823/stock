package in.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.practice.service.StockService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StockUIController {

	@Autowired
	private StockService service;
	
	@GetMapping("/")
	public String loadPage() {
		System.out.println("Loading page...");
		return "index";
	}
	
	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest request, Model model) {
		System.out.println("StockUIController.getTotalCost()");
		
		
		String companyName = request.getParameter("companyName");
		String quantity = request.getParameter("quantity");
		
		String cost = service.getTotalCost(companyName, Integer.parseInt(quantity));
		
		model.addAttribute("msg",cost);
		
		return "index";
	}
}
