package com.wiselink.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class PinyinUtil {
	
	private static ArrayList<PinyinBean> mBeanList;
	
	public static ArrayList<PinyinBean> sort(ArrayList<String> list){
		mBeanList = new ArrayList<PinyinBean>();
		for (String park : list) {
			if ((park.charAt(0)>=65&&park.charAt(0)<=90) || (park.charAt(0)>=97&&park.charAt(0)<=122)) {
				PinyinBean bean = new PinyinBean(park, park.toUpperCase().charAt(0));
				mBeanList.add(bean);
				continue;
			}
			HanyuPinyinOutputFormat formatter = new HanyuPinyinOutputFormat();
			formatter.setCaseType(HanyuPinyinCaseType.UPPERCASE);
			formatter.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
			formatter.setVCharType(HanyuPinyinVCharType.WITH_V);
			try {
				String[] pinyin = PinyinHelper.toHanyuPinyinStringArray(park.charAt(0), formatter);
				PinyinBean bean = new PinyinBean(park, pinyin[0].charAt(0));
				mBeanList.add(bean);
			} catch (BadHanyuPinyinOutputFormatCombination e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		Collections.sort(mBeanList);
		return mBeanList;
	}

}
