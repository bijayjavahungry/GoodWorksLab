package com.service;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static String getHashTags(String headLine) {
		List<String> hashTags = new ArrayList<String>();
		try {

			if (headLine != null) {
				headLine = headLine.replaceAll("\\p{Punct}", "");
				String[] headLineArr = headLine.split(" ");
				if (headLineArr.length < 3) {
					if (headLineArr.length == 1) {
						hashTags.add("#" + headLineArr[0]);
					} else {
						headLineArr[0].compareToIgnoreCase(headLineArr[1]);
						if (headLineArr[0].length() > headLineArr[1].length() || headLineArr[0].length() == headLineArr[1].length()) {
							hashTags.add("#" + headLineArr[0]);
							hashTags.add("#" + headLineArr[1]);
						} else if (headLineArr[0].length() < headLineArr[1].length()) {
							hashTags.add("#" + headLineArr[1]);
							hashTags.add("#" + headLineArr[0]);
						}
					}
				} else {
					String f = "";
					String s = "";
					String t = "";
					for (Integer i = 0; i < headLineArr.length; i++) {
						int currLen = headLineArr[i].length();
						if (currLen > f.length()) {
							t = s;
							s = f;
							f = headLineArr[i];
						} else if (currLen > s.length()) {
							t = s;
							s = headLineArr[i];
						} else if (currLen > t.length()) {
							t = headLineArr[i];
						}
					}
					hashTags.add("#" + f);
					hashTags.add("#" + s);
					hashTags.add("#" + t);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return hashTags.toString();
	}

	public static void main(String[] args) {
		// String hashTags = getHashTags("How the Avocado Became the Fruit of the Global
		// Trade");
		String hashTags = getHashTags("Visualizing Science");
		System.out.println("hashTags:: " + hashTags);
	}
}
