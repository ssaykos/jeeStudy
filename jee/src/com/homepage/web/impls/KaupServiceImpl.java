package com.homepage.web.impls;

import com.homepage.web.beans.KaupBean;
import com.homepage.web.service.KaupService;

public class KaupServiceImpl implements KaupService{


	private KaupBean vo = new KaupBean();
	private int idx;
	
	
	@Override	
	public int getKaupIndex(double height, double weight) {
		vo.setHeight(height);
		vo.setWeight(weight);
		
		return idx = (int)((weight / (height * height)) * 10000);
	}

	public String getResultMsg() {
		
		String msg = "";

		if (idx > 30)
			msg = "비만";
		else if (idx > 24)
			msg = "과체중";
		else if (idx > 20)
			msg = "정상";
		else if (idx > 15)
			msg = "저체중";
		else if (idx > 13)
			msg = "마름";
		else if (idx > 10)
			msg = "영양실조";
		else
			msg = "소모증";

		return msg;
	}




}
