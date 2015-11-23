package com.dorothy.tourtest.service.convert;

import java.io.IOException;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import com.dorothy.tourtest.vo.Root;

public class MarShallingConverter {
	@Resource(name="jaxb2Marshaller")
	private Marshaller marshaller;
	
	@Resource(name="jaxb2Marshaller")
	private Unmarshaller unmarshaller;
	
	public Root unmarshalling(StreamSource streamSource) throws XmlMappingException, IOException
	{
		StreamSource source = streamSource;
		return (Root) unmarshaller.unmarshal(source);
	}
}
