package cmcc.picrepository.webservice;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import cmcc.picrepository.dto.PicRepository; 

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月18日 上午9:51:35
 *
 * desc: ...
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface PicRepositorySoapService {
	
   public List<PicRepository> getAlls();
   public void del(Integer picRepositoryId);
   public PicRepository get(Integer picRepositoryId);
   public void update(PicRepository picRepository);
   public void add(PicRepository picRepository);
}
