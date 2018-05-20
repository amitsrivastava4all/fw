package com.brainmentors.apps.dao;

import com.brainmentors.apps.dto.UserDTO;

public interface IUserDAO {
	public UserDTO doLogin(UserDTO userDTO) throws Exception;
}
