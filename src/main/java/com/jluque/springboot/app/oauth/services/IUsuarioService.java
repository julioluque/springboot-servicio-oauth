package com.jluque.springboot.app.oauth.services;

import com.jluque.springboot.app.commons.models.entity.usuarios.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
