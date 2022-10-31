package System.WL.controller;

import System.WL.entity.Cliente;
import System.WL.DTO.ClienteDTO;
import System.WL.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1/")
public class Controller {

    @Autowired
    Repository repository;


    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = repository.save(cliente);
        return clienteSaved;

    }
    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        Optional <Cliente> clienteReturned = repository.findById(id);
        return clienteReturned;
    }
    @DeleteMapping("/{id}")
    public void deleteClienteById(@PathVariable Long id){
        repository.deleteById(id);
    }
    @GetMapping
    public List<Cliente> listClientes(){
        return repository.findAll();
    }
    @PutMapping("/atualize/{id}")
    public String updateClienteById(ClienteDTO clienteDTO, @PathVariable Long id){
        Optional <Cliente> velhocliente = repository.findById(id);
        if(velhocliente.isPresent()){
            Cliente cliente = velhocliente.get();
            cliente.setEndereco(clienteDTO.getEndereco());
            repository.save(cliente);
            return " Cliente de id " + cliente.getId() + " atualizado com sucesso! ";
        }else{
            return "Cliente de id " + id + " Não existe!";
        }
    }
}
