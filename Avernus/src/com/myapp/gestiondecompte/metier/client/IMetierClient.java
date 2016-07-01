package com.myapp.gestiondecompte.metier.client;

import java.util.List;

import com.myapp.gestiondecompte.entities.Client;

/*
 *  author : BERNARD Thomas
 *   interface : IMetierClient
 *    date : 30/06/2016
 * version : 1.0
 * 
 */
public interface IMetierClient {

	public Client addClient(Client c);
	public void deleteClient(Long idC);
	public Client updateClient(Client c);
	public List<Client> getClients();
	public List<Client> getClientsByMc(String mc);
	public Client getClientById(Long id);

}
