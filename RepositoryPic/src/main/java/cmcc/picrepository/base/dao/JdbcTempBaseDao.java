package cmcc.picrepository.base.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月17日 上午11:42:53
 *
 *          desc: ...
 */
public class JdbcTempBaseDao extends JdbcDaoSupport {
 
	@Resource(name = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void initSqlMapClient() {
		super.setJdbcTemplate(jdbcTemplate);
	}
}
