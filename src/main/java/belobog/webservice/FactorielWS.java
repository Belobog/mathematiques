package belobog.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;

import belobog.model.in.FactorielInput;
import belobog.model.out.FactorielOutput;
import belobog.validator.IFactorielValidator;
import belobog.service.IFactorielService;


@WebService(endpointInterface = "belobog.webservice.IFactorielWS")
@SOAPBinding(style = Style.RPC)
public class FactorielWS implements IFactorielWS {
	
	@Autowired
	private IFactorielValidator factorielValidator;
	private IFactorielService factorielService;

	@Override
	public FactorielOutput factoriel(@WebParam(name="rang")FactorielInput input) {
		FactorielOutput result = new FactorielOutput();
		try{
			factorielValidator.validate(input);
			result = factorielService.factoriel(input);
		}
		catch(Exception e){
			
		}
		return result;
	}

	public void setFactorielValidator(IFactorielValidator factorielValidator) {
		this.factorielValidator = factorielValidator;
	}

	public void setFactorielService(IFactorielService factorielService) {
		this.factorielService = factorielService;
	}
	
	

	
	
	


}
