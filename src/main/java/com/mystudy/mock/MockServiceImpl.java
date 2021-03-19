package com.mystudy.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mystudy.mock.domain.RandomVo;
import com.mystudy.mock.domain.Tb2DocInfoVo;
@Service
public class MockServiceImpl implements MockService {
	@Autowired
	private MockMapper mockMapper;
	
	@Override
	public List<Map<String, Object>> getMock() {
		return mockMapper.getMock();
	}

	@Override
	public void insertMock(Integer param) {
		mockMapper.deleteTb2DocInfo();
		mockMapper.deleteTb2ExpendInfo();
		mockMapper.deleteTb2ExpendDetail();
		mockMapper.deleteTb2DraftInfo();
		mockMapper.deleteTb2PurchaseInfo();
		mockMapper.deleteTb2PurchaseDetail();
		mockMapper.deleteTb2NewdocInfo();
		mockMapper.deleteTb2NewdocDetail();
		
		mockMapper.deleteTbDocInfo2();
		mockMapper.deleteTbDoctypeMaster();
		mockMapper.deleteTbDetail();
		mockMapper.deleteTbDetailMaster();
		
		
		for (int i = 0; i < param; i++) {
			RandomVo temp = mockMapper.getRandomRow();
			String docNo = "";
			if(i<param/4) {
				docNo = "EXP-"+i%(param/4);
			}else if(i<param/4*2) {
				docNo = "DF-"+i%(param/4);
			}else if(i<param/4*3) {
				docNo = "PO-"+i%(param/4);
			}else {
				docNo = "N1-"+i%(param/4);
			}
			// 기존DB 공통정보
			Tb2DocInfoVo a1 = new Tb2DocInfoVo();
			a1.setDocNo(docNo);
			a1.setRegDt(temp.getDatetime());
			a1.setRegId(temp.getUsername());
			a1.setDocTitle(temp.getLanguage());
			
			mockMapper.insertTb2DocInfo(a1);
			
		}
	}

}
