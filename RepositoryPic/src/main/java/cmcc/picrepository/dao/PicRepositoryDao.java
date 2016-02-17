package cmcc.picrepository.dao;

import java.util.List;

import cmcc.picrepository.dto.PicRepository;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月17日 上午10:26:34
 *
 * desc: ...
 */
public interface PicRepositoryDao { 
	public List<PicRepository> getAlls();
	public PicRepository getPicRepositoryById(int picRepositoryId);
	public int savePicRepository(PicRepository picRepository);
}
