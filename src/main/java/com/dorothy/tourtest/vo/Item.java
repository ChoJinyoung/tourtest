package com.dorothy.tourtest.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
	@XmlElement(name="item")
	private List<Element> list;

	public List<Element> getList() {
		return list;
	}

	public void setList(List<Element> list) {
		this.list = list;
	}
	
	
}
