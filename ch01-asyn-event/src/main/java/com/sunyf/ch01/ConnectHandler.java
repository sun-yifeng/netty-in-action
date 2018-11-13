package com.sunyf.ch01;

/**
 * @program: netty-in-action
 * @description: 被回调触发的 ChannelHandler
 * @author: Mr.Sun
 * @create: 2018-11-13 03:00
 **/

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ConnectHandler extends ChannelInboundHandlerAdapter {

    @Override
    //当一个新的连接已经被建立时，channelActive(ChannelHandlerContext)将会被调用
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client " + ctx.channel().remoteAddress() + " connected");
    }
}
