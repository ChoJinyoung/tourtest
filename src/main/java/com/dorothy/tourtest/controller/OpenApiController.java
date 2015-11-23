package com.dorothy.tourtest.controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dorothy.tourtest.service.convert.MarShallingConverter;
import com.dorothy.tourtest.service.serviceItf.RestTemplateService;
import com.dorothy.tourtest.vo.Root;

@Controller
@RequestMapping("/main")
public class OpenApiController {


	@Resource(name = "restTemplateService")
	private RestTemplateService restTemplateService;


	@Resource(name = "marshallingConverter")
	MarShallingConverter marshallingConverter;

	@RequestMapping("/searchForm")
	public String searchForm(Model model) throws XmlMappingException, IOException {
		String ServiceKey=URLDecoder.decode("Y%2F%2B8QM9fybwGiks8s1VgspVQNert5%2FG4DhQhS0LvXzCuOmCpubrUUs%2BR5OoOE4UwSbgAwOUrRxXMzbYnuPP7Jw%3D%3D","UTF-8");
		String url="http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode?serviceKey="+ServiceKey+"&areaCode=1&numOfRows=25&MobileOS=ETC&MobileApp=AppTesting";
		StreamSource streamSourceResult = restTemplateService.getRestDataXml(
				url, StreamSource.class);
		
		Root vo = marshallingConverter.unmarshalling(streamSourceResult);
		
		model.addAttribute("vo", vo);
		return "/ecgSearchForm";
	}
}
