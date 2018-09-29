package br.com.adrianofpinheiro.blocodenotas.repository

import br.com.adrianofpinheiro.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String>{

 fun findByTituloContainingIgnoreCase(titulo: String): List<Nota>

}
