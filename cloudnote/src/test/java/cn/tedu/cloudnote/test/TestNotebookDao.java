package cn.tedu.cloudnote.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.tedu.cloudnote.dao.NotebookDao;

public class TestNotebookDao extends TestCaseBase {
	NotebookDao dao;
	@Before
	public void initDao(){
		dao = ctx.getBean(
		"notebookDao", NotebookDao.class);
	}
	@Test
	public void testFindNotebookByUserId(){
		String userId="123";
		List<Map<String, Object>> list=
			dao.findNotebookByUserId(userId);
		for (Map<String, Object> map : list) {
			System.out.println(map); 
		}
	}
}




