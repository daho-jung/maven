package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("new");
		board.setContent("newc");
		board.setWriter("newbie");
		mapper.insert(board);
		log.info(board);
	}

	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setContent("newcc");
		board.setWriter("newb");
		board.setTitle("nnkk");
		mapper.insertSelectKey(board);

		log.info(board);
	}
	
	@Test
	public void testRead() {
		if(mapper.read(2L) != null)
			log.info(mapper.read(2L));
		else
			log.info("no data!!!!!!!!!!!!!");
	}
	
	@Test
	public void testDelete() {
		int r = mapper.delete(5L);
		if(r==1)
			log.info("delete compl");
		else
			log.info("no data");
	}
	@Test
	public void testUpdate() {
		BoardVO b = new BoardVO();
		b.setTitle("nnnq");
		b.setContent("qwer");
		b.setWriter("zxcv");
		b.setBno(3L);
		int t = mapper.update(b);
		log.info(t);
	}
}
