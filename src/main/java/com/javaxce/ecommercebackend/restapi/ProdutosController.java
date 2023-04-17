package com.javaxce.ecommercebackend.restapi;

import com.javaxce.ecommercebackend.persistence.ProdutosModel;
import com.javaxce.ecommercebackend.persistence.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    private final ProdutosRepository produtosRepository;

    public ProdutosController(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    @GetMapping
    public List<ProdutosModel> getProdutos() {
        return this.produtosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProdutosModel getProduto(@PathVariable Integer id) {
        return produtosRepository.findById(id).get();
    }

    @PostMapping
    public ProdutosModel createProduto(@RequestBody ProdutosModel produto) {
        return this.produtosRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Integer id) {
        produtosRepository.deleteById(id);
    }
}
