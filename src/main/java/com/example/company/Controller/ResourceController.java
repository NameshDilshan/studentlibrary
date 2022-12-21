/**
 * 
 */
package com.library.student.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @date 15 Dec 2022
 * @Project studentlibrary
 * @user namesh_001543
 */
@Controller
public class ResourceController {

	@GetMapping("/")
	public String getMainDashboard(Model model) {
		return "index.jsp";
	}
}
