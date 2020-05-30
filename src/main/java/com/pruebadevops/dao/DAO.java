/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebadevops.dao;

import com.pruebadevops.modelo.ModelData;

/**
 *
 * @author Fabricyber
 */
public class DAO {
    public static boolean validar(String header, String token)
	{
		ModelData response = new ModelData();
		return (response.getApiKey().equals(token) && response.getHeader().equals(header));
	}
}