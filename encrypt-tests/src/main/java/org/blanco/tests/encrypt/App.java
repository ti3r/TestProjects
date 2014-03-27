package org.blanco.tests.encrypt;

import static java.lang.System.out;
import java.security.KeyStoreException;
import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws KeyStoreException
    {
	for(Provider prov : Security.getProviders()){
	    out.println("Security Provider: "+prov.getName());
	    out.println("Services: ");
	    for(Service s : prov.getServices()){
		out.println("\t\t"+s.getAlgorithm());
	    }
	}
	
        out.println(keyStore.aliases());
    }
}
