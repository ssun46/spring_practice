package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.RegisterController;
import controller.LoginController;
import controller.LogoutController;
import controller.ChangePwdController;
import controller.MemberListController;
import controller.MemberDetailController;
import controller.RestMemberController;
import spring.MemberDao;
import spring.MemberRegisterService;
import spring.AuthService;
import spring.ChangePasswordService;
import survey.SurveyController;

@Configuration
public class ControllerConfig {

	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberRegisterService memberRegSvc;
	@Autowired
	private AuthService authService;
	@Autowired
	private ChangePasswordService changePasswordService;
	
	@Bean
	public RegisterController registerController() {
		RegisterController controller = new RegisterController();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}
	
	@Bean
	public SurveyController surveyContorller() {
		return new SurveyController();
	}
	
	@Bean
	public LoginController loginController() {
		LoginController loginController = new LoginController();
		loginController.setAuthService(authService);
		return loginController;
	}
	
	@Bean
	public LogoutController logoutController() {
		return new LogoutController();
	}
	
	@Bean
	public ChangePwdController changePwdController() {
		ChangePwdController controller = new ChangePwdController();
		controller.setChangePasswordService(changePasswordService);
		return controller;
	}
	
	@Bean
	public MemberListController memberListController() {
		MemberListController controller = new MemberListController();
		controller.setMemberDao(memberDao);
		return controller;
	}
	
	@Bean
	public MemberDetailController memberDetailController() {
		MemberDetailController controller = new MemberDetailController();
		controller.setMemberDao(memberDao);
		return controller;
	}
	
	@Bean
	public RestMemberController restApi() {
		RestMemberController controller = new RestMemberController();
		controller.setMemberDao(memberDao);
		controller.setResgisterService(memberRegSvc);
		return controller;
	}
}
