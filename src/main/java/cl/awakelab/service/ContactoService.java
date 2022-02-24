package cl.awakelab.service;

import cl.awakelab.model.entity.Contacto;
import cl.awakelab.model.repository.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    private IContactoRepository contRepo;


    public ContactoService(){
        super();
    }

    public List<Contacto> getAll(){
            return contRepo.findAll();
    }

    public Contacto getOne(Long idContacto){
        return contRepo.getOne(idContacto);
    }

    public void create (Contacto contacto){
        contRepo.save(contacto);
    }

    public void update(Contacto contacto){
        contRepo.save(contacto);
    }

    public void delete(Long idContacto){
        contRepo.delete(contRepo.getOne(idContacto));
    }
}
