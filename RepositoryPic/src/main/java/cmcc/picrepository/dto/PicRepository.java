package cmcc.picrepository.dto;

import java.io.Serializable;
import java.util.Date;
 




import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement; 
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cmcc.picrepository.util.DateAdapter;
 
 

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月15日 上午11:25:20
 *
 * desc: ...
 */ 
@XmlRootElement(name = "PicRepository") 
@XmlAccessorType(XmlAccessType.FIELD) 
public class PicRepository  implements Serializable{
	private static final long serialVersionUID = 1L;
//	id,origin_name,path,user_id,link,insert_time,last_update_time,desc,nextfix,pic_size
	 
	private int id; 
	private String originName; 
	private String path; 
	private int userId; 
	private String link; 
	@XmlJavaTypeAdapter(DateAdapter.class) 
	private Date insertTime;
	@XmlJavaTypeAdapter(DateAdapter.class) 
	private Date lastUpdateTime; 
	private String description; 
	private String nextfix; 
	private int picSize;
	
	
	public int getId() {
		return id;
	}
	public String getOriginName() {
		return originName;
	}
	public String getPath() {
		return path;
	}
	public int getUserId() {
		return userId;
	}
	public String getLink() {
		return link;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public String getDescription() {
		return description;
	}
	public String getNextfix() {
		return nextfix;
	}
	public int getPicSize() {
		return picSize;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setNextfix(String nextfix) {
		this.nextfix = nextfix;
	}
	public void setPicSize(int picSize) {
		this.picSize = picSize;
	}
}
