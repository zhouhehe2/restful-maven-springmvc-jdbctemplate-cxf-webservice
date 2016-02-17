package cmcc.picrepository.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.List;
 


import org.springframework.jdbc.core.RowMapper; 
import org.springframework.stereotype.Repository; 
   

import cmcc.picrepository.base.dao.JdbcTempBaseDao;
import cmcc.picrepository.dao.PicRepositoryDao;
import cmcc.picrepository.dto.PicRepository;
 

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月15日 下午2:59:54
 *
 * desc: ...
 */
@Repository
public class PicRepositoryDaoImpl   extends JdbcTempBaseDao  implements PicRepositoryDao{

	 
	@SuppressWarnings({ "rawtypes" })
	private class PicRepositoryRowMapper implements RowMapper {
		@Override
		public PicRepository mapRow(ResultSet rs, int i) throws SQLException {
			PicRepository pr = new PicRepository();
			pr.setId(rs.getInt("id"));
			pr.setOriginName(rs.getString("origin_name"));
			pr.setPath(rs.getString("path"));
			pr.setUserId(rs.getInt("user_id"));
			pr.setLink(rs.getString("link"));
			pr.setInsertTime(rs.getDate("insert_time"));
			pr.setLastUpdateTime(rs.getDate("last_update_time"));
			pr.setDescription(rs.getString("description"));
			pr.setNextfix(rs.getString("nextfix"));
			pr.setPicSize(rs.getInt("pic_size"));
			return pr;
		}
	}
	 
	@SuppressWarnings("unchecked")
	@Override
	public List<PicRepository> getAlls() {
		String sql = "select * from picrepository";
		return this.getJdbcTemplate().query(sql, new PicRepositoryRowMapper());
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public PicRepository getPicRepositoryById(int picRepositoryId) {
		String sql = "select * from picrepository where id=" + picRepositoryId; 
		List<PicRepository> userList = this.getJdbcTemplate().query(sql, new PicRepositoryRowMapper());
		if (userList !=null && userList.size() > 0 ) {
			return userList.get(0);
		}else{
			return null;	
		}
	}
	
	@Override
	public int savePicRepository(PicRepository picRepository) {
		String sql = "insert into picrepository(origin_name,path,user_id,link,insert_time,last_update_time,description,nextfix,pic_size) values (?,?,?,?,?,?,?,?,?)";
		return this.getJdbcTemplate().update(sql, new Object[] {
				 picRepository.getOriginName() 
				,picRepository.getPath()
				,picRepository.getUserId()
				,picRepository.getLink()
				,picRepository.getInsertTime()
				,picRepository.getLastUpdateTime()
				,picRepository.getDescription()
				,picRepository.getNextfix()
				,picRepository.getPicSize()
		});
	}
}
