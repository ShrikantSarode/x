package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.CricketTeam;

@Controller
@SessionAttributes({ "loggedInUser" })
public class SpringMvcController {
	@GetMapping("/doGreet")
	public String getHomePage() {
		System.out.println("Inside getHomePage()");
		return "home";
	}

	// @RequestMapping("/doLogin")
	@GetMapping("/addTeam")
	public String getAddTeamPage() {
		System.out.println("Inside getAddTeamPage()");
		return "addTeam";
	}

	@PostMapping("/showTeam")
	public String getResultPageAgain(
			@RequestParam("t_id") String teamId, 
			@RequestParam("t_name") String teamName,
			@RequestParam("t_rank") int testRanking,
			@RequestParam("o_rank") int odiRanking,
			@RequestParam("t2_rank") int t20Ranking,
			Model modelObject) {
		String resultPage = "failure";
		CricketTeam cricketTeamModel = new CricketTeam(teamId, teamName, testRanking, odiRanking, t20Ranking);
			resultPage = "showTeam";
		return resultPage;
	}
}
