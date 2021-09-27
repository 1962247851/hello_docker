# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER miaojinzhou <1962247851@qq.com>
#工作目录
#WORKDIR /opt/docker/blog/

# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp

#声明了容器应该打开的端口，实际上不会有什么操作，只是一个提示
#EXPOSE 80 443

#定义参数
#ARG JAR_FILE

# 时区配置
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

# 环境变量
#ENV HOST 81.70.194.184

# 将jar包添加到容器中并更名为app.jar
ADD *.jar app.jar

#拷贝本地文件到镜像中#复制上下文目录下的target/demo-1.0.0.jar 到容器里
#COPY ${JAR_FILE} penguin-log-web.jar

# COPY和ADD的区别时COPY的SRC只能是本地文件，其他用法一致。

# 运行jar包
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
