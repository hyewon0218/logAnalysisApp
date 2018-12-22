package kr.co.sist.log.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import kr.co.sist.log.view.Login;
import kr.co.sist.log.view.SelectLog;

/////////////// 12-22-2018 로그인  Event구현(헤원) //////////////////////
public class LoginEvt implements ActionListener {

	private Login login;
	
	public LoginEvt(Login login) {
		this.login = login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 로그인 버튼 눌렸을때 이벤트 처리
		String id=login.getJtId().getText();
		String pw=login.getJtPw().getText();
		
		if(id.equals("admin")&& pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			new SelectLog(login);
		}else if(id.equals("root")&& pw.equals("1111")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			new SelectLog(login);
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패");	
		}
	}
}
