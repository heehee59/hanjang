package com.mycompany.myapp.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mycompany.myapp.vo.OrderListVO;
import com.mycompany.myapp.vo.PageVO;

// 주문확인리스트
public interface OrderListDAO {

	// 주문확인서 인서트
	void insertOrderList(OrderListVO orderListVO);
	
	// 주문확인서 하나보기
	List<OrderListVO> getOneOrderList(int orderListNo);
	
	// 주문확인서 유저별 최근 하나 가져오기
	List<OrderListVO> getLatelyOrderList(OrderListVO orderListVO);
	
	// 인서트시 아이템아이디 체크
	int checkOrderItemId(OrderListVO orderListVO);
	
	// 주문내역 가져오기
	List<OrderListVO> getOrderedList(@Param("userNo") int userNo, @Param("pv") PageVO pv);
	
	// 총 주문 개수 조회
	int countPosts(int userNo);
}
