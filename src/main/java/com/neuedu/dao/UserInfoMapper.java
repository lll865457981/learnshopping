package com.neuedu.dao;

import com.neuedu.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    List<UserInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserInfo record);
    /**
     * 校验用户名是否存在
     */
    int checkUsername(String username);
    /**
     * 校验用户名是否存在
     */
    int checkEmail(String email);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    UserInfo selectUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
    /**
     * 根据用户名查找密保问题
     */
    String selectQuestionByUsername(String username);
    /**
     * 校验答案
     */
    int selectByUsernameAndQuestionAndAnswer(@Param("username") String username,@Param("question") String question,@Param("answer")String answer);
    /**
     * 根据用户名修改密码
     */
    int updatePsswordByUsername(@Param("username")String username,@Param("password") String passwordNew);

    /**
     * 更新用户信息
     */
    int updateUserBySelectActive(UserInfo userInfo);
}