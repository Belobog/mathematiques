package belobog.service;

import java.math.BigInteger;

import belobog.model.in.FactorielInput;
import belobog.model.out.FactorielOutput;



public class FactorielService implements IFactorielService {

	@Override
	public FactorielOutput factoriel(FactorielInput input) {
		FactorielOutput resultat = new FactorielOutput();
		int rang = Integer.parseInt(input.getParametre());
		resultat.setResultat(new BigInteger("1"));
		while(rang > 0){
			resultat.setResultat(resultat.getResultat().multiply(new BigInteger(rang+"")));
			rang --;
		}
		return resultat;
	}

	
}
