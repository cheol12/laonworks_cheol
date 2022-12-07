package com.laonworks502.team1st.service.admin;

import java.util.List;

import com.laonworks502.team1st.model.admin.AdminBean;
import com.laonworks502.team1st.model.users.GeneralUserBean;

public interface AdminService {

	// 관리자 로그인
    public AdminBean getAdminInfo(String adminId) throws Exception;
<<<<<<< HEAD
=======

    //일별 가입자 수 
    public int usersJoinTotal(int n, String duration) throws Exception;
//    // 최근 7일간 가입자 수 
//    public int todayJoinTotal() throws Exception;
//    public int ago1JoinTotal() throws Exception;
//    public int ago2JoinTotal() throws Exception;
//    public int ago3JoinTotal() throws Exception;
//    public int ago4JoinTotal() throws Exception;
//    public int ago5JoinTotal() throws Exception;
//    public int ago6JoinTotal() throws Exception;
//    public int ago7JoinTotal() throws Exception;
>>>>>>> branch 'dev-minyoung2' of https://github.com/laonworks502/team1st.git
    
    //일반회원 일별 가입자 수 
    public int joinTotalDays(int i) throws Exception;
    
    //일반회원 주별 가입자 수
    public int joinTotalWeeks(int i) throws Exception;
    
    //일반회원 월별 가입자 수
    public int joinTotalMonths(int i) throws Exception;
    
    //기업회원 일별 가입자 수
    public int companyJoinChartDate(int i) throws Exception;
    
    //기업회원 주별 가입자 수
    public int companyJoinChartWeek(int i) throws Exception;
    
    //기업회원 월별 가입자 수
    public int companyJoinChartMonth(int i) throws Exception;
    
    //generalusers - 전체 회원 수 구하기
    public int countAllUsers() throws Exception;
    
    //generlauserslist 
    public List<GeneralUserBean> generalUsersList(Integer page) throws Exception;
}
