package com.wsb.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_order")
public class OrderDO {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("good_id")
    private String goodId;

    @TableField("price")
    private Double price;
}
