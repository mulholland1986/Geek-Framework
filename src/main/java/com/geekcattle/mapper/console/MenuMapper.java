package com.geekcattle.mapper.console;

import com.geekcattle.model.console.Menu;
import com.geekcattle.util.CustomerMapper;

import java.util.List;
import java.util.Set;

public interface MenuMapper extends CustomerMapper<Menu> {
    Set<String> findMenuByUserId(String userId);
    List<Menu> selectMenuByAdminId(String userId);
    List<Menu> selectMenuByRoleId(String roleId);
}