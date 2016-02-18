package cmcc.picrepository.webservice.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;

import cmcc.picrepository.dao.PicRepositoryDao;
import cmcc.picrepository.dto.PicRepository;
import cmcc.picrepository.webservice.PicRepositorySoapService;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月18日 上午9:54:43
 *
 * desc: ...
 */
@Service 
@WebService(endpointInterface="cmcc.picrepository.webservice.PicRepositorySoapService", serviceName="PicRepositorySoapService")
@SOAPBinding(style = Style.RPC) 
public class PicRepositorySoapServiceImpl implements PicRepositorySoapService{

	@Resource
	PicRepositoryDao picRepositoryDao; 
	
	@Override
	public List<PicRepository> getAlls() { 
		return null;
	}

	@Override
	public void del(Integer picRepositoryId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PicRepository get(Integer picRepositoryId) {
		return picRepositoryDao.getPicRepositoryById(picRepositoryId);
	}

	@Override
	public void update(PicRepository picRepository) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(PicRepository picRepository) {
		// TODO Auto-generated method stub
		
	}
	

}
