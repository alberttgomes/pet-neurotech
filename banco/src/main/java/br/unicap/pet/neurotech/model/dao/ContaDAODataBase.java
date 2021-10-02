package br.unicap.pet.neurotech.model.dao;

import br.unicap.pet.neurotech.model.exceptions.ContaInexistenteException;
import br.unicap.pet.neurotech.model.exceptions.SaldoInsuficienteException;


public class ContaDAODataBase implements ContaDAO {
	
	 public ContaDAODataBase() {
	 }
	 
	 private static ContaDAODataBase self;
	 private AdmBanco CDB = new  AdmBanco();

      public static ContaDAO getInstance() {
    	  if(self == null) {
    		  self = new ContaDAODataBase();
    	  }
    	  return self;
      }
      
    
	@Override
      public boolean BuscarConta(int numConta) {
    	  boolean check = false;
    	  String buscar = "Select num from sql10439832.ContaAlbert where num = " + numConta + ";";
    	  String resul = CDB.Select(buscar,8);
    	  if(resul.equals("") == false) {
    		  check = true;
    	  } else {
    		  return check;
    	  }
    	  return check;
      }
}



