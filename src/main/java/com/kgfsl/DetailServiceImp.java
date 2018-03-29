package com.kgfsl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("detailService")
public class DetailServiceImp implements DetailService {

    @Autowired
    private DetailRepository dt;

    @Override
    public List<Demo> getAll() {
        // TODO Auto-generated method stub
        return dt.findAll();
    }

    @Override
    public Demo save(Demo event) {
        // TODO Auto-generated method stub
        return dt.saveAndFlush(event);

    }

	@Override
	public void delete(Long id) {
         dt.delete(id);
		
	}

	@Override
	public Demo find(Long id) {
	 return dt.findOne(id);
	}
}
