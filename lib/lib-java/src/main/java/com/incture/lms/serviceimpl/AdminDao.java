package com.incture.lms.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;

import com.incture.lms.dao.BaseDao;
import com.incture.lms.dto.BookRequestDto;
import com.incture.lms.dto.ResponseDto;
import com.incture.lms.dto.UserReqBookDto;
import com.incture.lms.util.TableConfig;

public class AdminDao extends BaseDao {

	public ResponseDto getAllRequestedBook() {
		ResponseDto responseDto = new ResponseDto();
		List<UserReqBookDto> list = new ArrayList<UserReqBookDto>();
		try {
			String queryString = "SELECT B.BOOK_NAME,B.BOOK_CODE,U.USER_NAME,U.USER_CODE,U.USER_ID,BR.ORDER_REQUEST_CODE,BR.REQUESTED_DATE "
					+ "FROM \"" + TableConfig.SCHEMA + "\".\"" + TableConfig.PACKAGE
					+ "\\:\\:LMS_ORDER_REQUEST\" AS BR " + "INNER JOIN \"" + TableConfig.SCHEMA + "\".\""
					+ TableConfig.PACKAGE + "\\:\\:LMS_BOOK\" AS B " + "ON BR.BOOK_CODE = B.BOOK_CODE "
					+ "INNER JOIN \"" + TableConfig.SCHEMA + "\".\"" + TableConfig.PACKAGE + "\\:\\:LMS_USER\" AS U "
					+ "ON BR.USER_CODE = U.USER_CODE";
			SQLQuery query = this.getSession().createSQLQuery(queryString);
			List<Object[]> queryList = query.list();
			for (Object[] obj : queryList) {
				UserReqBookDto dto = new UserReqBookDto();
				dto.setBookName(obj[0] == null ? "" : obj[0].toString());
				dto.setBookCode(obj[1] == null ? "" : obj[1].toString());
				dto.setUserName(obj[2] == null ? "" : obj[2].toString());
				dto.setUserCode(obj[3] == null ? "" : obj[3].toString());
				dto.setUserId(obj[4] == null ? "" : obj[4].toString());
				dto.setRequestCode(obj[5] == null ? "" : obj[5].toString());
				dto.setRequestedDate((Date) obj[5]);
				list.add(dto);
			}
			responseDto.setStatus("200");
			responseDto.setMessage("Succes");
			responseDto.setList(list);
			return responseDto;
		} catch (Exception e) {
			e.printStackTrace();
			responseDto.setStatus("500");
			responseDto.setMessage("Error");
			return responseDto;
		}

	}

	public ResponseDto assignBooks(BookRequestDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
