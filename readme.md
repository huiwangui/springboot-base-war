springboot程序war包部署：

1、程序入口类需扩展继承SpringBootServletInitializer类

2、程序入口类覆盖如下方法：
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(SpringbootBaseApplication.class);
}

3、更新包为war,在pom.xml中修改<packaging>war</packaging>

4、配置springboot打包的插件
<!-- springboot打包的插件-->
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>

5、在项目中通过Maven install在本地Maven仓库安装成一个war包，然后将war包部署
 到tomcat下运行；