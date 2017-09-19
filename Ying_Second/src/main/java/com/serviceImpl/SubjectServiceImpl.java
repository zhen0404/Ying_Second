package com.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Subject;
import com.bean.Subject_bbin_purchase_record;
import com.dao.SubjectDao;
import com.service.SubjectService;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService{
           
	 @Autowired
     @Qualifier("subjectDaoImpl")
       private SubjectDao subjectDaoImpl;
        
	
		public List<Subject> listSubject() {
			return subjectDaoImpl.listSubject();
		}

		
		public Subject getById(int id) {
			Subject sub=this.subjectDaoImpl.getById(id);
			return sub;
		}

	
		public void updateSub(Subject sub) {
			this.subjectDaoImpl.updateSub(sub);
		}

		
		public void p2pAdd(Subject sub) {
	   this.subjectDaoImpl.p2pAdd(sub);		
		}

		
		public List<Subject_bbin_purchase_record> listp2pton() {
			return this.subjectDaoImpl.listp2pton();
		}


		public List<Subject> query(String hql) {
	    return this.subjectDaoImpl.query(hql);
		}


		public List<Subject> listSubject(Map map) {
			return subjectDaoImpl.listSubject(map);
		}
	       
	       
}
