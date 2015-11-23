package com.dorothy.tourtest.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class Root {
	
	@XmlElement(name="body")
	private Items root;
	@XmlElement(name="header")
	private Result resultVo;
	
	public Items getRoot() {
		return root;
	}

	public void setRoot(Items root) {
		this.root = root;
	}

	public Result getResultVo() {
		return resultVo;
	}

	public void setResultVo(Result resultVo) {
		this.resultVo = resultVo;
	}
}
