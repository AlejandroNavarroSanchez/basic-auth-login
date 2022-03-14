package com.example.basicauth.model.service;

import com.example.basicauth.model.entity.Videojoc;
import com.example.basicauth.model.repository.RepositoriVideojoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServeiVideojoc {
    private final RepositoriVideojoc repoVideojocs;

    public List<Videojoc> llistarVideojocs(){
        return repoVideojocs.findAll();
    }

    public Videojoc consultarPerId(Long id){
        return repoVideojocs.findById(id).orElse(null);
    }

    public Videojoc eliminarVideojoc(Long id){
        Videojoc res=repoVideojocs.findById(id).orElse(null);
        if(res!=null) repoVideojocs.deleteById(id);
        return res;
    }

    public Videojoc afegirVideojoc(Videojoc v){
        return repoVideojocs.save(v);
    }

    /** si existeix el videojoc el modifica (el torna a gravar), altrament retorna null*/
    public Videojoc modificarVideojoc(Videojoc v){
        Videojoc res=null;
        if(repoVideojocs.existsById(v.getId())) res=repoVideojocs.save(v);
        return res;
    }


}