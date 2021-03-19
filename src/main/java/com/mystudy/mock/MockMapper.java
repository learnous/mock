package com.mystudy.mock;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mystudy.mock.domain.RandomVo;
import com.mystudy.mock.domain.Tb2DocInfoVo;
import com.mystudy.mock.domain.Tb2DraftInfoVo;
import com.mystudy.mock.domain.Tb2ExpendDetailVo;
import com.mystudy.mock.domain.Tb2ExpendInfoVo;
import com.mystudy.mock.domain.Tb2NewdocDetailVo;
import com.mystudy.mock.domain.Tb2NewdocInfoVo;
import com.mystudy.mock.domain.Tb2PurchaseDetailVo;
import com.mystudy.mock.domain.Tb2PurchaseInfoVo;
import com.mystudy.mock.domain.TbDetailMasterVo;
import com.mystudy.mock.domain.TbDocDetailVo;
import com.mystudy.mock.domain.TbDocInfoVo;
import com.mystudy.mock.domain.TbDoctypeMasterVo;
@Repository
@Mapper
public interface MockMapper {
	RandomVo getRandomRow();
	List<Map<String, Object>> getMock();
	void insertTb2DocInfo(Tb2DocInfoVo param);
	void insertTb2ExpendInfo(Tb2ExpendInfoVo param);
	void insertTb2ExpendDetail(Tb2ExpendDetailVo param);
	void insertTb2DraftInfo(Tb2DraftInfoVo param);
	void insertTb2PurchaseInfo(Tb2PurchaseInfoVo param);
	void insertTb2PurchaseDetail(Tb2PurchaseDetailVo param);
	void insertTb2NewdocInfo(Tb2NewdocInfoVo param);
	void insertTb2NewdocDetail(Tb2NewdocDetailVo param);
	
	void insertTbDocInfo2(TbDocInfoVo param);
	void insertTbDoctypeMaster(TbDoctypeMasterVo param);
	void insertTbDetail(TbDocDetailVo param);
	void insertTbDetailMaster(TbDetailMasterVo param);
	
	
	void deleteTb2DocInfo();
	void deleteTb2ExpendInfo();
	void deleteTb2ExpendDetail();
	void deleteTb2DraftInfo();
	void deleteTb2PurchaseInfo();
	void deleteTb2PurchaseDetail();
	void deleteTb2NewdocInfo();
	void deleteTb2NewdocDetail();
	
	void deleteTbDocInfo2();
	void deleteTbDoctypeMaster();
	void deleteTbDetail();
	void deleteTbDetailMaster();
	
	
}
