package com.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.model.HelperBean;
import com.sample.service.HelperService;

@Controller

public class HelpController {

	@Autowired

	private HelperService helpService;

	// invoke the service class - calculateTotalCost method.

	@ModelAttribute("serviceList")

	public Map<String, String> buildState() {

		Map<String, String> pairs = new HashMap<String, String>();

		pairs.put("ACService", "ACService");

		pairs.put("RefrigeratorService", "RefrigeratorService");

		pairs.put("WashingMachineService", "WashingMachineService");

		return pairs;

	}

	@RequestMapping(value = "/helpDesk", method = RequestMethod.POST)

	public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean, ModelMap model) {

		double totalCost = helpService.calculateTotalCost(helperBean);

		model.addAttribute("cost", totalCost);

		return "helpdesk";

	}

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)

	public String showPage(@ModelAttribute("helper") HelperBean helperBean) {

		return "showpage";

	}

}