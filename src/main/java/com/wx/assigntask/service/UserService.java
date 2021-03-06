package com.wx.assigntask.service;

import com.wx.assigntask.entity.ReleaseTask;
import com.wx.assigntask.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wx
 * @Date: 2018/12/4 19:02
 * @Version 1.0
 */
@Repository
public interface UserService {
    public User queryUser(int id);
    public ReleaseTask queryRelease(int id);
}
