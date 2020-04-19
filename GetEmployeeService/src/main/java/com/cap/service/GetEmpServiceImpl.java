package com.cap.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.GetEmpDao;




@Service
	@Transactional
public class GetEmpServiceImpl implements GetEmpService {
	 @Autowired
	    private GetEmpDao dao;

	    public GetEmpDao getDao(){
	        return dao;
	    }
	    @Override
	public Object findEmployee(Integer id) {
	
		return dao.findById(id);
				}


}
