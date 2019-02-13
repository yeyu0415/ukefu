package com.ukefu.webim.service.impl;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ukefu.webim.service.repository.ContactsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ukefu.util.extra.DataExchangeInterface;
import com.ukefu.webim.service.es.ContactsRepository;
import com.ukefu.webim.web.model.Contacts;

@Service("contacts")
public class ContactsDataExchangeImpl implements DataExchangeInterface{
	@Autowired
	private ContactsRepository contactsRes ;

	@Autowired
	private ContactsRespository contactsRespository;
	
	public Contacts getDataByIdAndOrgi(String id, String orgi){
		return contactsRes.findOne(id) ;
	}

	@Override
	public List<Serializable> getListDataByIdAndOrgi(String id , String creater, String orgi) {
		return null ;
	}
	
	public void process(Object data , String orgi) {
		
	}

	public Iterator<Contacts> queryList(Integer pageNum,Integer pageSize) {
		PageRequest p=new PageRequest(pageNum,pageSize);
		//List<Contacts> list=contactsRespository.findAll();
		Page<Contacts> pageable=contactsRespository.findAll(p);


		return pageable.iterator();
	}
}
