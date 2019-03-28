package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import cn.itsource.aigou.plat.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zw
 * @create: 2019-03-26 18:50
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //不为空
        if(user!=null && !StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())){
            if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
                return new AjaxResult().setMsg("登录成功");
            }else{
                return new AjaxResult().setSuccess(false).setMsg("登录失败");
            }
        }else {
            return new AjaxResult().setSuccess(false).setMsg("登录失败！");
        }
    }
}
