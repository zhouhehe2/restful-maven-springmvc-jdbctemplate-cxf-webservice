package cmcc.picrepository.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月15日 下午2:42:34
 *
 * desc: ...
 */
@XmlRootElement(name = "PicRepositorys")
public class PicRepositorys {
	private List<PicRepository> picRepositorys;
	@XmlElement(name = "PicRepository")
	public List<PicRepository> getPicRepositorys() {
		return picRepositorys;
	}
	public void setUsers(List<PicRepository> picRepositorys) {
		this.picRepositorys = picRepositorys;
	}
} 