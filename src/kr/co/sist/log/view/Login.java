package kr.co.sist.log.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import kr.co.sist.log.evt.LoginEvt;

/////////////// 12-22-2018 로그인  JFrame구현(헤원) //////////////////////
public class Login extends JFrame {
	
	private JTextField jtId;
	private JTextField jtPw;
	private JButton jbLogin;
	private JLabel idLabel;
	private JLabel jlId;
	private JLabel jlPw;

	public Login() {
		super("로그인 창");
		
		jtId = new JTextField();
		jtPw = new JTextField();
		jbLogin = new JButton("Login");
		jlId= new JLabel("아이디");
		jlPw = new JLabel("비밀번호");
		
		LoginEvt le = new LoginEvt(this);
		jbLogin.addActionListener(le);
		
		setLayout(null);
		jlId.setBounds(10, 30, 70, 30);
		jlPw.setBounds(10, 80, 70, 30);
		jtId.setBounds(100, 30, 150, 30);
		jtPw.setBounds(100, 80, 150, 30);
		jbLogin.setBounds(120, 150, 70, 30);
		
			
		add(jlId);
		add(jlPw);
		add(jtId);
		add(jtPw);
		add(jbLogin);
			
		setBounds(100, 100, 300, 230);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getJtId() {
		return jtId;
	}
	public JTextField getJtPw() {
		return jtPw;
	}
}

