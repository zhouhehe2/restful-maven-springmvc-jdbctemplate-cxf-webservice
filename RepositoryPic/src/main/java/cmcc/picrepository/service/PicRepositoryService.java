package cmcc.picrepository.service;
 
import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status; 

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;  

import cmcc.picrepository.dao.PicRepositoryDao;
import cmcc.picrepository.dto.PicRepository;
import cmcc.picrepository.dto.PicRepositorys;
 

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月16日 下午1:47:41
 *
 * desc: ...
 */
@Path(value = "/picRepository")
@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML})
@Service
@Transactional
public class PicRepositoryService {

	@Resource
	PicRepositoryDao picRepositoryDao; 
	
	@GET
	 @Produces({ MediaType.APPLICATION_XML})  
	@Path("/get/{picRepositoryId}")
	public PicRepository getPicRepository(@PathParam("picRepositoryId")int   picRepositoryId) {
		PicRepository picRepository =picRepositoryDao.getPicRepositoryById(picRepositoryId);
		if (picRepository == null) {
			ResponseBuilder builder = Response.status(Status.NOT_FOUND);
			builder.type("application/xml");
			builder.entity("<errorMsg>PicRepository with id:" + picRepositoryId+ " can not be found!</errorMsg>");
			throw new WebApplicationException(builder.build());
		} else {
			System.out.println("PicRepository with id:" + picRepositoryId+ " is found");
			return picRepository;
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_XML})
	@Path("/add")
	public Response addPicRepository(PicRepository picRepository) {
		picRepositoryDao.savePicRepository(picRepository);
		return Response.ok(picRepository).build();
	}

	@DELETE
	@Consumes({ MediaType.APPLICATION_XML})
	@Path("/delete/{picRepositoryId}")
	public Response deletePicRepository(@PathParam("picRepositoryId")int picRepositoryId) { 
		return null;
	}

	@PUT
	@Path("/put")
	@Consumes({ MediaType.APPLICATION_XML})
	public Response updatePicRepository(PicRepository picRepository) {
		// TODO Auto-generated method stub 
		return null;
	}

	@GET
	@Path("/getAlls")
	@Produces({ MediaType.APPLICATION_XML})
	public PicRepositorys getPicRepositorys() {
		// TODO Auto-generated method stub
		return null;
	}

}
