package com.ys.mapper;

import com.ys.po.User;

public interface UserMapper {
	//���� id ��ѯ user ������
	public User selectUserById(int id) throws Exception;
}
