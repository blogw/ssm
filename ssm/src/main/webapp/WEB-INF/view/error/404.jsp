<%--
  Created by IntelliJ IDEA.
  User: blogw
  Date: 2017/04/13
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.StringWriter" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background: black;
            color: white;
        }
        .image {
            margin: 0 auto;
            width: 350px;
            height: 180px;
            font-size: 20px;
            color: #F00;
        }

        .container{
            margin:0 auto;
            width:1024px;
        }
        #q{
            border:1px solid black;
            width:1024px;
            height:768px;
        }
    </style>
</head>
<body>
<div class="image">
<pre>

      .o     .oooo.         .o
    .d88    d8P'`Y8b      .d88
  .d'888   888    888   .d'888
.d'  888   888    888 .d'  888
88ooo888oo 888    888 88ooo888oo
     888   `88b  d88'      888
    o888o   `Y8bd8P'      o888o
</pre>
</div>
<div class="container"><canvas id="q"></canvas></div>
<script type="text/javascript" >
    var canvas = document.getElementById('q');
    var ctx = canvas.getContext('2d');

    canvas.height = window.innerHeight;
    canvas.width = window.innerWidth;

    var texts = '君不见，黄河之水天上来，奔流到海不复回。君不见，高堂明镜悲白发，朝如青丝暮成雪。人生得意须尽欢，莫使金樽空对月。天生我材必有用，千金散尽还复来。烹羊宰牛且为乐，会须一饮三百杯。岑夫子，丹丘生，将进酒，杯莫停。与君歌一曲，请君为我倾耳听。钟鼓馔玉不足贵，但愿长醉不复醒。古来圣贤皆寂寞，惟有饮者留其名。陈王昔时宴平乐，斗酒十千恣欢谑。主人何为言少钱，径须沽取对君酌。五花马，千金裘，呼儿将出换美酒，与尔同销万古愁。'.split('');

    var fontSize = 25;
    var columns = canvas.width/fontSize;
    // 用于计算输出文字时坐标，所以长度即为列数
    var drops = [];
    //初始值
    for(var x = 0; x < columns; x++){
        drops[x] = 1;
    }

    function draw(){
        //让背景逐渐由透明到不透明
        ctx.fillStyle = 'rgba(0, 0, 0, 0.05)';
        ctx.fillRect(0, 0, canvas.width, canvas.height);
        //文字颜色
        ctx.fillStyle = '#0F0';
        ctx.font = fontSize + 'px arial';
        //逐行输出文字
        for(var i = 0; i < drops.length; i++){
            var text = texts[Math.floor(Math.random()*texts.length)];
            ctx.fillText(text, i*fontSize, drops[i]*fontSize);

            if(drops[i]*fontSize > canvas.height || Math.random() > 0.95){
                drops[i] = 0;
            }

            drops[i]++;
        }
    }

    setInterval(draw, 66);
</script>
</body>
</html>
