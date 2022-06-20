package ws.service.imaal.exception.mapper;

import javax.annotation.Priority;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import ws.service.imaal.exception.ImaalException;

@Provider
@Priority(200)
public class ServiceExceptionHandler implements ExceptionMapper<ImaalException> 
{
	@Override
	public Response toResponse(ImaalException exception) {
		return Response.status(exception.getErroBean().getStatus()).entity(exception.getErroBean()).build();
	}
}
