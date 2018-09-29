package br.com.adrianofpinheiro.blocodenotas.controller

import br.com.adrianofpinheiro.blocodenotas.model.Nota
import br.com.adrianofpinheiro.blocodenotas.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.xml.ws.Service

@RestController
@RequestMapping("/nota")
class NotaController{

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun  checkHealth():String{
        return "OK! Ok! ok!"
    }

    @GetMapping
    fun buscarTodos(): List<Nota>{
        return notaService.buscarTodo()
    }

    @PostMapping
    fun salvar(@RequestBody nota: Nota): Nota{
        return notaService.salvar(nota)
    }

    @DeleteMapping("/{id}")
    fun apagar(@PathVariable("id")id: String){
        notaService.apagar(id)
    }

    @GetMapping("{/id}")
    fun buscarPor (id: String): Nota {
        return notaService.buscarPor(id)
    }

    @GetMapping("/titulo/{titulo}")
    fun buscarPorTitulo(titulo: String): List<Nota>  {
        return notaService.buscarPorTitulo(titulo)
    }

}











