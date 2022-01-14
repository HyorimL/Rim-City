package com.yedam.lhr.voca;

public class Vocabulary {
	
	
	
	private int vocaNo;
	private String vocaWord;
	private String vocaMean;
	private int vocaLearn;
	
	
	
	public int getVocaNo() {
		return vocaNo;
	}
	public void setVocaNo(int vocaNo) {
		this.vocaNo = vocaNo;
	}
	public String getVocaWord() {
		return vocaWord;
	}
	public void setVocaWord(String vocaWord) {
		this.vocaWord = vocaWord;
	}
	public String getVocaMean() {
		return vocaMean;
	}
	public void setVocaMean(String vocaMean) {
		this.vocaMean = vocaMean;
	}
	public int getVocaLearn() {
		return vocaLearn;
	}
	public void setVocaLearn(int vocaLearn) {
		this.vocaLearn = vocaLearn;
	}
	@Override
	public String toString() {
		return vocaNo + ". " + vocaWord + " : " + vocaMean + " [" + (vocaLearn == 1 ? : "미암기" : "암기") + "]";
	}
	
	

}
