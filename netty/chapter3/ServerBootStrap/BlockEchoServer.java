import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;

public class BlockEchoServer {
	public static void main(String[] args) {
		EventLoopGroup bossGroup = new OioEventLoopGroup(1);
		EventLoopGroup workerGroup = new OioEventLoopGroup();
		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workerGroup)
				.channel(OioServerSocketChannel.class)
				.childHandler(new ChannelInitializer<SocketChannel>() {
					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						ChannelPipeline p = ch.pipeline();
						p.addLast(new EchoServerHandler());
					}
				});
			ChannelFuture f = b.bind(8888).sync();
			f.channel().closeFuture().sync();
		} catch(Exception e) {
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}
}
