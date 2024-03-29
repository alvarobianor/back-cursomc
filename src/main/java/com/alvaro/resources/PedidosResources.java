package com.alvaro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.domain.Pedido;
import com.alvaro.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidosResources {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Pedido obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
