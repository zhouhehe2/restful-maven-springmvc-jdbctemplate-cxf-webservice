package cmcc.picrepository.restfulservice;
 
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

import org.springframework.stereotype.Component; 

import cmcc.picrepository.dto.PicRepository;
import cmcc.picrepository.dto.PicRepositorys;
import cmcc.picrepository.webservice.PicRepositorySoapService;
 

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月16日 下午1:47:41
 *
 * desc: ...
 */
@Path(value = "/picRepository")
@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML}) 
@Component 
public class PicRepositoryRestService {
 
	@Resource
	PicRepositorySoapService picRepositorySoapService;
	
	@GET
	 @Produces({ MediaType.APPLICATION_XML})  
	@Path("/users/{userId}/pics/{picRepositoryId}")
	public PicRepository getPicRepository(@PathParam("userId")int userId,@PathParam("picRepositoryId")int picRepositoryId) {
		PicRepository picRepository =picRepositorySoapService.get(picRepositoryId);
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
		picRepositorySoapService.add(picRepository);
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
		return null;
	}

	@GET
	@Path("/getAlls")
	@Produces({ MediaType.APPLICATION_XML})
	public PicRepositorys getPicRepositorys() {
		return null;
	}

}
