package com.wiselink.main;

import java.util.ArrayList;

import demo.Pinyin4jAppletDemo;

public class MainTest {

	private static ArrayList<String> parkList;

	public static void main(String[] args) {
		parkList = new ArrayList<String>();
		parkList.add("中国");
		parkList.add("美国");
		parkList.add("日本");
		parkList.add("zzz");
		parkList.add("aaa");
		
		ArrayList<PinyinBean> list = PinyinUtil.sort(parkList);
//		System.out.println("list = " + list);
		for (PinyinBean pinyinBean : list) {
			System.out.println(pinyinBean.getParkName()+pinyinBean.getHeadLetter());
		}
	}
}
