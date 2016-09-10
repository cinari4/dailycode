import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class EchoClientHandler extends ChannelInboundHandlerAdapter {
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		String sendMsg = "Hello, Netty";
		
		ByteBuf msgBuffer = Unpooled.buffer();
		msgBuffer.writeBytes(sendMsg.getBytes());
		
		StringBuilder sb = new StringBuilder();
		sb.append("sent msg : ").append(sendMsg);
		
		System.out.println(sb.toString());
		ctx.writeAndFlush(msgBuffer);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		String readMsg = ((ByteBuf)msg).toString(Charset.defaultCharset());
		
		StringBuilder sb = new StringBuilder();
		sb.append("received msg : ").append(readMsg);
		
		System.out.println(sb.toString());
	}
	
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.close();
	}
	
	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

}
