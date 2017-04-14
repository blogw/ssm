智能检索jar升级

maven POM.xml 标签详解
http://blog.csdn.net/sunzhenhua0608/article/details/32938533

http://www.vaikan.com/jansi/

mvn install:install-file -Dfile=c:/javax.servlet-api-3.1.0.jar -DgroupId=javax.servlet -DartifactId=servlet-api -Dversion=3.1.0 -Dpackaging=jar
mvn install:install-file -Dfile=c:/castor-1.0.5.jar -DgroupId=castor -DartifactId=castor -Dversion=1.0.5 -Dpackaging=jar

多视图支持（xml格式比较受限，要设置@XmlElement，Object转不了）
http://blog.csdn.net/yu412346928/article/details/20637439

http://ascii.mastervb.net/text_to_ascii.php

archetype
http://blog.csdn.net/maotai_2010/article/details/47973957
>mvn archetype:create-from-project
>cd target\generated-sources\archetype
修改文件及archetype-metadata.xml

	    <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-archetype-plugin</artifactId>
                <version>3.0.0</version>
                <configuration>
		    <!--定义需要替换的文件,注意xml的version相同也会被替换-->
                    <archetypeFilteredExtentions>java</archetypeFilteredExtentions>
                </configuration>
            </plugin>


>mvn install

springmvc test
http://jinnianshilongnian.iteye.com/blog/2004660

markdown
https://github.com/atlassian/commonmark-java

利用servlet3.0技术的WebApplicationInitializer实现0配置，excludeFilters不好用
http://hanqunfeng.iteye.com/blog/2114975
http://jinnianshilongnian.iteye.com/blog/1991830

加入jcl-over-slf4j可以将spring-core默认使用common-loggin（jdk的logging？）变为使用slf4j,统一为logback
但是org.apache.tomcat，org.apache.catalina的控制不了