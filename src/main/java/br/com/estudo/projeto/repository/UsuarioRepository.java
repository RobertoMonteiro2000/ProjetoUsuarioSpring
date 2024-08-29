package br.com.estudo.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>  {

}
