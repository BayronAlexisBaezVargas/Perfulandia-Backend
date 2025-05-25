package com.perfumeria.perfumeria_pedido.controller;
import com.perfumeria.perfumeria_pedido.model.pedido;
import com.perfumeria.perfumeria_pedido.repository.PedidoRepository;
import com.perfumeria.perfumeria_pedido.service.PedidoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    private final PedidoService Repo;

    public PedidoController(PedidoService Repo) {
        this.Repo=Repo;
    }
    @GetMapping
    public List<pedido> listar() {
        return Repo.listar();
    }
    @PostMapping
    public pedido guardar(@RequestBody pedido pedido) {
        return Repo.guardar(pedido);
    }
    @GetMapping
    public pedido buscar(@PathVariable long id) {
        return Repo.buscarPorId(id);
    }
    @DeleteMapping
    public void eliminar(@PathVariable long id) {
        Repo.eliminar(id);
    }
}
