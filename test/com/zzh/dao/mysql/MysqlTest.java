package com.zzh.dao.mysql;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.zzh.dao.DBCase;
import com.zzh.dao.DBObject;
import com.zzh.dao.Pager;
import com.zzh.dao.SimpleCondition;

public class MysqlTest extends DBCase {

	public MysqlTest() {
		dsFile = "mysql.properties";
		sqlFile = "com/zzh/dao/mysql/create.sqls";
	}

	@Test
	public void testQuery() {
		Pager pager = dao.createPager(2, 3);
		List<DBObject> list = dao.query(DBObject.class, new SimpleCondition("id>4 AND id<19"), pager);
		assertEquals(3, list.size());
		assertEquals("one_8", list.get(1).getTxt());
		assertEquals(0,pager.getPageCount());
		assertEquals(0,pager.getRecordCount());
	}
	
}