package belobog.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import belobog.model.in.FactorielInput;
import belobog.model.out.FactorielOutput;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IFactorielWS {

	FactorielOutput factoriel(@WebParam(name="rang")FactorielInput input);
}
