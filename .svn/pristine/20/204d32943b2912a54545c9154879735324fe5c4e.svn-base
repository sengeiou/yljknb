package com.wondersgroup.local.jkgz.ysgz;

import com.wondersgroup.local.jkgz.model.GzModel;


/**
 * 运算规则 return: 0:无异常,1:有异常
 * 
 * @author 王俊钊
 * 
 */
public class Jkgz_Ysgz {

	public static int ysgz_main(GzModel model) {
		String bjnr=model.getBjnr();
		String sjnr=model.getSjnr();
		int ysgz=model.getYsgz();
		int result=0;
		switch (ysgz) {
		case 1:
			result=ysgz_1(bjnr,sjnr);
			break;
		case 2:
			result=ysgz_2(bjnr,sjnr);
			break;
		case 3:
			result=ysgz_3(bjnr,sjnr);
			break;
		case 4:
			result=ysgz_4(bjnr,sjnr);
			break;
		case 5:
			result=ysgz_5(bjnr,sjnr);
			break;
		case 6:
			result=ysgz_6(bjnr,sjnr);
			break;
		case 7:
			result=ysgz_7(bjnr,sjnr);
			break;
		case 8:
			result=ysgz_8(bjnr,sjnr);
			break;
		default:
			break;
		}
		return result;
	}

	private static int ysgz_1(Object bjnr, Object sjnr) {
		return 0;
	}

	private static int ysgz_2(Object bjnr, Object sjnr) {
		if (bjnr.toString().equals(sjnr.toString())) {
			return 0;
		} else {
			return 1;
		}
	}

	private static int ysgz_3(Object bjnr, Object sjnr) {
		return 0;
	}

	private static int ysgz_4(Object bjnr, Object sjnr) {
		return 0;
	}

	private static int ysgz_5(Object bjnr, Object sjnr) {
		if(Integer.parseInt(bjnr.toString())>=Integer.parseInt(sjnr.toString())){
			return 0;
		}
		return 1;
	}

	private static int ysgz_6(Object bjnr, Object sjnr) {
		return 0;
	}

	private static int ysgz_7(Object bjnr, Object sjnr) {
		
		if(Integer.parseInt(bjnr.toString())<=Integer.parseInt(sjnr.toString())){
			return 0;
		}
		return 1;
	}

	private static int ysgz_8(Object bjnr, Object sjnr) {
		return 0;
	}
}
