package belobog.service;

import belobog.model.in.FactorielInput;
import belobog.model.out.FactorielOutput;



public interface IFactorielService {

	FactorielOutput factoriel(FactorielInput input);

}
