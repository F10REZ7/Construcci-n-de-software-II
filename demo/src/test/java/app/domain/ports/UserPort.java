package app.domain.ports;

import app.domain.model.Users;

public interface UserPort { 
	public Users findByDocument(String Users) throws Exception;
	public Users finByUsername(String Users) throws Exception;
	public void save(Users Users) throws Exception;
	
}
