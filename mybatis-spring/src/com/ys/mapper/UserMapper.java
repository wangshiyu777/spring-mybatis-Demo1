package com.ys.mapper;

import com.ys.po.User;

public interface UserMapper {
	//根据 id 查询 user 表数据
	public User selectUserById(int id) throws Exception;
}
