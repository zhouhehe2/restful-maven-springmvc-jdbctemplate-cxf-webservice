package cmcc.picrepository.restfulservice;

import java.io.File; 

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;  

import org.springframework.stereotype.Component; 


/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月17日 下午2:26:59
 *
 * desc: ...
 */
@Path(value = "/showPic")
@Produces({ MediaType.APPLICATION_XML}) 
@Consumes({ MediaType.APPLICATION_XML})
@Component
public class ShowPicRestService {

	@GET
	@Produces("image/*")
	@Path("/users/{userId}/pics/{picName}")
	public Response getInputStream(@PathParam("userId")int   userId,@PathParam("picName")String   picName) {
		File file = new File("C:\\Users\\cmcc-B100036\\Desktop\\1.png");
		
		
	    return Response.ok(file,"image/jpg").build();
	}
}
