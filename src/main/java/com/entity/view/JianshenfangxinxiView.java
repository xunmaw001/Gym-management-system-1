package com.entity.view;

import com.entity.JianshenfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-01-26
 */
@TableName("jianshenfangxinxi")
public class JianshenfangxinxiView extends JianshenfangxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public JianshenfangxinxiView() {

	}
	private String jlname;

	public String getJlname() {
		return jlname;
	}

	public void setJlname(String jlname) {
		this.jlname = jlname;
	}

	public JianshenfangxinxiView(JianshenfangxinxiEntity jianshenfangxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, jianshenfangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
