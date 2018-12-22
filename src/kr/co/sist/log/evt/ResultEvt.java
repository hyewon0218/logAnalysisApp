package kr.co.sist.log.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kr.co.sist.log.view.Result;

public class ResultEvt implements ActionListener {
	
	private Result r;
	
	public ResultEvt(Result r) {
		this.r = r;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 확인 버튼 누르면 종료 구현
	}
}
