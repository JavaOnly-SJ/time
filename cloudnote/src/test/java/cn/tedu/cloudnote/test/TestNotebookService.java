package cn.tedu.cloudnote.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.tedu.cloudnote.service.NotebookService;

public class TestNotebookService 
	extends TestCaseBase{
	
	NotebookService service;
	
	@Before
	public void initService(){
		service = ctx.getBean("notebookService",
			NotebookService.class);
	}
	
	@Test
	public void testListNotebooks(){
		String userId="123";
		List<Map<String, Object>> list=
			service.listNotebooks(userId);
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
}





