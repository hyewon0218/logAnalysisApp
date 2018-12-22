package kr.co.sist.log.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kr.co.sist.log.evt.ResultEvt;
import kr.co.sist.log.evt.SelectLogEvt;


/////////////// 12-22-2018 Result JDialog구현(정미) //////////////////////
public class Result extends JDialog {
	
	private SelectLogEvt sle;
//	private JButton jbConfirm; 
	private JPanel jpn;

	public Result(SelectLogEvt sle, SelectLog sl) {
		super(sl, "결과 출력",true);
		this.sle = sle;
		
		// 결과를 출력할 결과창 구현
		//컴포넌트 만들기
		
		JPanel pnNo = new JPanel();
		JPanel pnCe= new JPanel();
		
		pnNo.add(new JButton("파일명"));
		pnNo.add(new JLabel("file_result"));
		pnNo.add(new JButton("생성된 날짜"));
		pnNo.add(new JLabel("Date_result"));
		
		pnCe.add(new JButton("1  최다 사용키"));
		pnCe.add(new JTextArea("결과 "));
		pnCe.add(new JButton("2 브라우저별 접속횟수, 비율"));
		pnCe.add(new JTextField(" "));
		pnCe.add(new JButton("3 서비스를 성공 실패 횟수"));
		pnCe.add(new JLabel(" "));
		pnCe.add(new JButton("4  요청이 가장 많은 시간"));
		pnCe.add(new JLabel(" "));
		pnCe.add(new JButton("5 비정상 요청 횟수 비율"));
		pnCe.add(new JTextField(" "));
		pnCe.add(new JButton("6  입력 라인 정보출력"));
		pnCe.add(new JTextField(" "));
		
		pnNo.setLayout(new GridLayout(1, 4));
		pnCe.setLayout(new GridLayout(6, 2));
		setLayout(new BorderLayout());
		
		//배치
		add("North",pnNo);
		add("Center",pnCe);
		
		
		ResultEvt r = new ResultEvt(this);
		
		setBounds(400, 300, 600, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
}

/////////////// 12-22-2018 Result JDialog구현(정미) 끝 //////////////////////