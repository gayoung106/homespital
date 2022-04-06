package mna.homespital.service;

import mna.homespital.dto.Doctor;
import mna.homespital.dto.Pharmacy;
import mna.homespital.dto.User;

public interface MemberService {


    //가영: 로그인
    boolean login(String user_email, String user_password) throws Exception;

    //용식:회원가입
    User join(User user) throws Exception;

    //용식:비밀번호변경
    void modifyPassword(String user_email, String user_password) throws Exception;

    //용식: 비밀번호찾기 이메일보내기
    String sendMailForFindPw(String email) throws Exception;

    //소연 : 환자(User)정보 가져오기
    User getUserDetail(int user_number) throws Exception;

    //소연 : 의사(Doctor)정보 가져오기
    Doctor getDoctorDetail(int doctor_number) throws Exception;

    //소연 : 약사(Pharmacy)정보 가져오기
    Pharmacy getPharDetail(int pharmacy_number) throws Exception;

    //가영: 회원탈퇴
    void deleteMember(String user_email) throws Exception;

    //가영: 회원정보수정
    public void modifyMember(String user_email, String user_password, String user_name, String user_registration_number, String user_phone, String user_address) throws Exception;

    //용식 :유저정보 가져오기
    User queryMember(String email) throws Exception;

    //가영: 비밀번호확인
    void passwordMember(String user_email) throws Exception;


    //용식: 이메일중복체크
    boolean emailCheck(String email) throws Exception;

    User findByEmail(String email) throws Exception;
}